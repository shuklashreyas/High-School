// Implements a dictionary's functionality

#include <ctype.h>
#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <strings.h>
#include "dictionary.h"

// Represents a node in a hash table
typedef struct node
{
    char word[LENGTH + 1];
    struct node *next;
}
node;

// Number of buckets in hash table
const unsigned int N = 10000;

// Hash table
node *table[N];

// Returns true if word is in dictionary else false
bool check(const char *word)
{
    int hashValue = hash(word);
    if(table[hashValue] == NULL)
    {
        return false;
    }
    else
    {
        struct node *b;
        b = table[hashValue];
        while(b!= NULL && (strcasecmp(word,b-> word) == 0))
        {
            return true;
            b = b->next;
        }
       
       
    }
    return false;
}

// Hashes word to a number
unsigned int hash(const char *word)
{
   int length = strlen(word);
   unsigned int hash_value = 0;
   
   for(int a = 0; a < length; a++)
   {
       hash_value += tolower(word[a]);
       hash_value = hash_value * tolower(word[a]) % N;
   }
    return hash_value;
}

// Loads dictionary into memory, returning true if successful else false
bool load(const char *dictionary)
{
    FILE *dict_ptr = fopen(dictionary,"r");
    if(dict_ptr == NULL)
    {
        return false;
    }
    char buffer[LENGTH + 1];
    
    while(fscanf(dict_ptr,"%s",buffer) != EOF)
    {
        struct node *temp =(struct node*) malloc(sizeof(struct node));
        
        if(temp == NULL)
        {
            return false;
        }
        temp -> next = NULL;
        strcpy(temp->word,buffer);
        int hashCode = hash(temp->word);
        
        if(table[hashCode] == NULL)
        {
            table[hashCode] = temp;
        }
        else
        {
            temp -> next = table[hashCode];
            table[hashCode] = temp;
        }
    }
    
   
   fclose(dict_ptr);
   return true;
}

// Returns number of words in dictionary if loaded else 0 if not yet loaded
unsigned int size(void)
{
    int words = 0;
    
    for(int a = 0; a < N; a++)
    {
        struct node*b;
        b = table[a];
        if(b!= NULL)
        {
            b = b->next;
            words++;
        }
    }
    return words;
}

// Unloads dictionary from memory, returning true if successful else false
bool unload(void)
{
    for(int a = 0; a < N; a++)
    {
        struct node *temp;
        temp = table[a];
        
        struct node *temp2;
        temp2 = table[a];
        
        while(temp != NULL)
        {
            temp2 = temp;
            temp = temp ->next;
            free(temp2);
        }
    }
    return true;
}
