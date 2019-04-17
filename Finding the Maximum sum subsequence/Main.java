#include<stdio.h>
int main()
{
        int N;
        scanf("%d",&N);
        int arr[20];
        int i, j;
        for(i=0; i<N; i++)
        {
            scanf("%d",&arr[i]);
        }
        printf("%d",sum( arr, N ) );
        return 0;
}
     int sum( int arr[], int n )
    {
        int r, max, i;
  
 	    r = arr[0];
  	    max = arr[0];
  	    for(i = 1; i < n; i++)
        {
            if(arr[i] > arr[i-1])
            {
                r += arr[i];
            }
            else 
            {
                r = arr[i];
            }
            if(r > max)
            {
                max = r;
            }
        }
        return max;
    }