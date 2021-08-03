#include <stdio.h>
#include <cs50.h>
#include <string.h>
#include <math.h>

int main(void)
{
   
   bool check = false;
   int height = get_int("Height: ");
   while(check == false)
   {
      if(height >= 1 && height <= 8)
      {
         check = true;
      }
      else
      {
         height = get_int("Height:");
      }
   }
   /*
   int count = 0;
   
   for(int a = 0; a< height; a++)
   {
      count++;
      for(int b = 0; b < count; b++)
      {
         printf("#");
      }
      printf("\n");
   }
   */
   
   int dots = (height - 1);
   int count = 1;
   for(int a = 0; a < height; a++)
   {
      for(int b = 0; b < dots; b++)
      {
         printf(" ");
      }
      
      for(int c = 0; c < count;c++)
      {
         printf("#");
      }
      printf("\n");
      count++;
      dots--;
   }
   
   
}
