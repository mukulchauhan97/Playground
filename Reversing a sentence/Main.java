#include <stdio.h>
#include <string.h>

int main()
{
    char str[1000], reverse[1000];
    int len, i, index, wordS, wordEnd;
    gets(str);
    len= strlen(str);
    index = 0;
   
    wordS = len - 1;
    wordEnd= len - 1;
    while(wordS > 0)
    {
        
        if(str[wordS] == ' ')
        {
          
            i = wordS + 1;
            while(i <= wordEnd)
            {
                reverse[index] = str[i];

                i++;
                index++;
            }
            reverse[index++] = ' ';
            wordEnd = wordS - 1;
        }
           wordS--;
    }
   
    for(i=0; i<=wordEnd; i++)
    {
        reverse[index] = str[i];
        index++;
    }
    
    reverse[index] = '\0'; 
    printf("%s", reverse);
    return 0;
}