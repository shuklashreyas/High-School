
#include <stdio.h>
#include <cs50.h>
#include <string.h>
#include <math.h>
#include <ctype.h>

int main(int argc, char** argv)
{
    if (argc == 2 && isdigit(*argv[1]))
    {   
        int move;
        sscanf(argv[1], "%d", &move);
        string text = get_string("plaintext: ");  
        printf("ciphertext: ");
        
        move = move - ((move / 26) * 26);
        
        for(int a = 0; a <strlen(text); a++)
        {
            
            char current = text[a];
            int ascii = (int) current;
            if(ascii >= 65 && ascii <= 90)
            {
                int newAscii = ascii + move;
                if(newAscii > 90)
                {
                    newAscii = newAscii - 26;
                }
             
                char val = (char) newAscii;
                printf("%c",val);
            }
            
            else if(ascii >= 97 && ascii <= 122)
            {
                int newAscii = ascii + move;
                if(newAscii > 122)
                {
                    newAscii = newAscii - 26;
                }
                char val = (char) newAscii;
                printf("%c",val);
                
            }
            
            else 
            {
                printf("%c",current);
            }
            
        }
        
        printf("\n");
        return 0;
    }
    else
    {
        printf("Usage: ./caesar k\n");
        return 1;
    }
}
