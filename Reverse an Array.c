#include <stdio.h>

int main()
{
    int a[]={8,2,3,5,1};
    
    int n=sizeof(a)/sizeof(a[0]);
    
    int b[n];
    for(int i=0;i<n;i++)
    {
        b[i]=a[n-i-1];
    }
    
    for(int i=0;i<n;i++)
    {
       printf("%d\t",b[i]);
    }
}
