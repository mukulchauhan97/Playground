#include<stdio.h>

int main()
{
    int n;
	scanf("%d",&n);
    int list[n];
  
  
    for(int ind = 0;ind < n; ind++)
    {
        scanf("%d",&list[ind]);   
    }
    insert(n,list);
    return 0;
}    
int insert(int n,int list[])
{
	for (int idx1 = 1; idx1 < n/2; idx1++) 
    {
        int key = list[idx1];
        int idx2 = idx1 - 1;
        while((idx2 >= 0) && (list[idx2] > key)) 
        {
            list[idx2 + 1] = list[idx2];
            idx2--;
        }
        list[idx2 + 1] = key;
    }
    for(int i = 0; i < n; i++)
    {
        printf("%d ", list[i]);
    }
    return 0;
}

