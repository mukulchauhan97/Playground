#include<stdio.h>
int pow(int base, int exponent);
int main(){
    int base, exponent;
    scanf("%d%d", &base, &exponent);
    printf("%d", pow(base, exponent));
  	return 0;
}

int pow(int base, int exponent)
{
    int power = 1;
    while(exponent >= 1)
    {
        power = power * base;
        exponent--;
    }
    return power;
}