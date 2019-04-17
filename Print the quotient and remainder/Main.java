#include<stdio.h>
int main()
{
  int x = 365;
  int quotient , remainder ;
  scanf("&d",&quotient);
  scanf("&d" ,&remainder);
  quotient = x / 4;
  remainder = x % 4;
  printf("Quotient: %d\n",quotient);
  printf("Remainder: %d",remainder);
  return 0;
}