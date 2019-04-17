#include <stdio.h>
int main() {
    int n;
    scanf("%d", &n);
	int value = n;
	for(int i = 1; i <= n; i++)
	{
        
	    for(int j = value; j >= 1; j--)
	    {
	        printf("%d", j);
          
	    }
	    value--;
	    printf("\n");
	}
	return 0;
}