#include <stdio.h>

int main()
{
    int num[]={10,73,6,8,4};
    
    int small=num[0];
    int n=sizeof(num)/sizeof(num[0]);
    
    for(int i=0;i<n;i++)
        if(num[i]<small)
            small=num[i];
    
    printf("%d",small);
}
