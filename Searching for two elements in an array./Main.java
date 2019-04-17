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
        int search_elem_1;
        scanf("%d",&search_elem_1);
        int search_elem_2;
        scanf("%d",&search_elem_2);
        int elem_1_idx = -1;
        int elem_2_idx = -1;
        for(int i = 0; i <= arr_size - 1; i++)
        {
            if(search_elem_1 == arr[i])
            {
                elem_1_idx = i;
            }
            if(search_elem_2 == arr[i])
            {
                elem_2_idx = i;
            }
        }
        printf("%d\n",elem_1_idx);
        printf("%d\n",elem_2_idx);
    return 0;
}
