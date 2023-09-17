#include <stdio.h>

int main()
{
    int num[]={21,3,76,45,99};
    
    int large=num[0];
    int n=sizeof(num)/sizeof(num[0]);
    
    for(int i=0;i<n;i++)
    {
        if(num[i]>large)
            large=num[i];
    }
    printf("%d",large);
}
