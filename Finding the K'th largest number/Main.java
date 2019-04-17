#include<stdio.h>
int main()
{
        int n;
        scanf("%d",&n);
        int arr[10];
        for(int idx = 0; idx <= n - 1; idx++)
        {
            scanf("%d",&arr[idx]);
        }
        int k;
        scanf("%d",&k);
       
        selection_sort(n, arr);
        printf("%d",arr[n-k]);
    return 0;
}
     void selection_sort(int n, int arr[])
    {
        for(int start_idx = 0; start_idx <= n - 2; start_idx++)
        {
            int min_idx = find(start_idx, arr, n-1);
            swap(start_idx, min_idx, arr);
        }
    }
      void swap(int start_idx, int min_idx, int arr[])
      {
         int temp = arr[start_idx];
         arr[start_idx] = arr[min_idx];
         arr[min_idx] = temp;
     }
     int find(int start_idx, int arr[], int end_idx)
     {
         int min_idx = 0;
         if(arr[start_idx] < arr[start_idx + 1])
         {
             min_idx = start_idx;
         }
         else
         {
             min_idx = start_idx + 1;
         }
         for(int i = start_idx + 2; i <= end_idx; i++)
         {
             if(arr[min_idx] > arr[i])
             {
                 min_idx = i;
             }
         }
         return min_idx;
     }

