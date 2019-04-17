#include<stdio.h>


int sum_of_n_numbers(int num)
{
    int sum = 0;
    for(int i = 1; i <= num; i++){
        sum = sum + i;
    }
    return sum;
}
int main()
{
   int n;
   scanf("%d", &n);
   printf("%d", sum_of_n_numbers(n)); 
  	return 0;
}
