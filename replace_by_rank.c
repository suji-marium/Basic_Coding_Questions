#include <stdio.h>

int main()
{
    int a[]={100,7,8,2};
    int n=sizeof(a)/sizeof(a[0]);
    
    int temp[n],x;
    
    for(int i=0;i<n;i++)
        temp[i]=a[i];
    
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n-i-1;j++)
        {
            if(temp[j]>temp[j+1])
            {
                x=temp[j];
                temp[j]=temp[j+1];
                temp[j+1]=x;
            }
        }
    }
    
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(a[i]==temp[j])
            {
                a[i]=j+1;
            }
        }
    }
    
    for(int i=0;i<n;i++)
    {
        printf("%d\t",a[i]);
    }
    
}
