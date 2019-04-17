#include<stdio.h>
int main()
{
    char string[1000], c;
  
    int i, key;
    
  
  
    scanf("%[^\n]s",string);
    scanf("%d",&key);			
    key=key%26;
 
    for(i = 0; string[i] != '\0';i++)		
    {
        c = string[i];
        
        if(c >= 'a' && c <= 'z')			
        {
            c = c - key;
            if(c < 'a')
            {
                c = c + 'z' - 'a' + 1;
            }
            
            string[i] = c;
        }
        //For Upper case alphabets
        else if(c >= 'A' && c <= 'Z')		
        {
            c = c - key;
            
            if(c < 'A')
            {
                c = c + 'Z' - 'A' + 1;
            }
            string[i] = c;
        }
    }
   
    printf("%s", string);					
    
    return 0;
}