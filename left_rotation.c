#include <stdio.h>

int main()
{
    int n,l,x;
    printf("Enter size: ");
    scanf("%d",&n);
    
    int a[n];
    printf("Enter elements: ");
    for(int i=0;i<n;i++)
        scanf("%d",&a[i]);
   
    printf("Enter number of left rotation: ");
    scanf("%d",&l);
    
    for(int i=0;i<l;i++)
    {
        int x=a[0];
        for(int i=1;i<n;i++)
            a[i-1]=a[i];
        a[n-1]=x;
    }

    
    for(int i=0;i<n;i++)
    {
        printf("%d\t",a[i]);
    }
    
}
