#include<stdio.h>
int main()
{
    int n,first_d, last_d, sum;
    scanf("%d", &n);
    
    last_d = n % 10;
    while (n >= 10)
    {
        n = n/10;
    }
    first_d = n;
    sum = first_d + last_d;
    printf("%d", sum);
    return 0;
}