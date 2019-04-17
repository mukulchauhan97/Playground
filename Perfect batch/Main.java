#include<stdio.h>
int main() {
   int size,list[10],i;
   
   scanf("%d",&size);

   for( i = 0; i < size ; i++)
   {
       scanf("%d",&list[i]);
   }
  
   largest(list,size);
  
   return 0;  
}

 void largest(int list[],int size)
 {
     int i, b1 = 0, b2 = 0;
     
     for( i = 0; i < size/2 ; i++)
     { 
       b1 = b1 + list[i];
      
     }  
    
     for( i = size/2; i < size ; i++)
     { 
       b2 = b2 + list[i];
      
     }  
     
     if(b1 == b2)
     {
         printf("Perfect Batch" );
   
     }
     else
     {
         printf("Not a Perfect Batch");
     }
 }