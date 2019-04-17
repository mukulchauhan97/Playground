#include<stdio.h>
int main()
{
        int arr_size;
        scanf("%d",&arr_size);
        int arr[10];
        for(int i = 0; i <= arr_size - 1; i++)
        {
            scanf("%d",&arr[i]);
        }
        int max_no;
        if(arr[0] > arr[1])
        {
            max_no = arr[0];
        }
        else{
             max_no = arr[1];
        } 
        for(int i = 2; i <= arr_size - 1; i++)
        {
            if(max_no < arr[i])
            {
                max_no = arr[i];
            }
        }
        printf("%d",max_no);
    return 0;
}