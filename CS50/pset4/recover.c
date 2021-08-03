#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[])
{
    FILE *file = fopen(argv[1], "r");
    
    if(file == NULL)
    {
        return 1;
    }
    
    unsigned char currentBlock [512];
    int imageCount = 0;
    FILE * pic = NULL;
    
    
    while (fread(currentBlock, 512, 1, file) == 1)
    {
        if(currentBlock[0] == 0xff && currentBlock[1] == 0xd8 && currentBlock[2] == 0xff && (currentBlock[3] & 0xf0) == 0xe0)
        {
              imageCount++;
            if(imageCount > 1)
            {
                fclose(pic);
            }
            
          
            char fileName[4];
            int fileNameDigit = imageCount - 1;
            sprintf(fileName,  "%03i.jpg",fileNameDigit);
            pic = fopen(fileName, "a");
        }
        
        if(imageCount >= 1)
        {
            fwrite(currentBlock,512,1,pic);
        }
        
        
    }
    
    fclose(file);
    fclose(pic);
    return 0;
}
