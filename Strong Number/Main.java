#include <stdio.h>
int main() {
	int n,sum = 0;
	scanf("%d", &n);
	int temp = n;
	while(temp > 0)
    {
	    int rem = temp % 10;
	    int fact = 1;
	    for(int i = 1; i <= rem; i++)
        {
	        fact = fact * i;
	    }
	    sum = sum + fact;
	    temp = temp / 10;
	}
	if(n == sum)
    {
      
	    printf("Yes");
	}
	else
    {
	    printf("No");
	}
	return 0;
}