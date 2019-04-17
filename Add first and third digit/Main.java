#include<stdio.h>
int main()
{
  int n,i,j,k,l;
  scanf("%d%d",&n,&i);
  i = n%10;
  k = n/100;
  l = i+k;
  printf("%d",l);
  return 0;
}