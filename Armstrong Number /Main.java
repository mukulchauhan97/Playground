

#include <stdio.h> 
#include<math.h>
int main() 
{ 
    int n, sum = 0, temp, rem, d = 0; 
    scanf("%d", &n);  
    temp = n; 
    while (temp != 0) 
    { 
        d++; 
        temp = temp / 10; 
    } 
    temp = n; 
 
    while (temp != 0) 
    { 
        rem = temp % 10; 
        sum = sum + pow(rem, d); 
        temp = temp / 10; 
    }  
    if (n == sum) 
        printf("Armstrong Number"); 
    else 
        printf("Not an Armstrong Number");  
    return 0; 
}