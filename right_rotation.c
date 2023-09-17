#include <stdio.h>

int main()
{
    int n,r,x;
    printf("Enter size: ");
    scanf("%d",&n);
    
    int a[n];
    printf("Enter elements: ");
    for(int i=0;i<n;i++)
        scanf("%d",&a[i]);
   
    printf("Enter number of right rotation: ");
    scanf("%d",&r);
    
    for(int j=0;j<r;j++)
    {
        x=a[n-1];
        for(int i=n-1;i>=1;i--)
            a[i]=a[i-1];
        a[0]=x;
    }
    
    for(int i=0;i<n;i++)
    {
        printf("%d\t",a[i]);
    }
    
}
