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
     int i,large ,max_idx;
     large = list[0];
     max_idx = 0 ;
     for( i = 1; i < size ; i++)
   { 
       if(large < list [i])
       {
           max_idx = i;
           
       }
      
   }  
   printf("%d",max_idx);
   
 }