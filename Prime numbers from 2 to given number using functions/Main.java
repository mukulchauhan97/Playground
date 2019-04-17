#include<stdio.h>
int prime(int m);
int main(){
    int n;
    scanf("%d", &n) ;   
  
    for(int i = 2; i <= n; i++)
    {
        if(prime(i))
        {
            printf("%d\n", i);
        }
    }
    return 0;
}

int prime(int m)
{
    int isprime = 1;
    for(int num = 2; num <= m/2; num++)
    {
        if(m % num == 0)
        {
            isprime = 0;
            break;
        }
    }
    return isprime;
}