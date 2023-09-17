#include <stdio.h>

int main()
{
    int n,flag=0;
    printf("Enter a number: ");
    scanf("%d",&n);
    
    for(int i=1;i<=n;i++)
    {
        if(i*i==n)
        {
            flag=1;
            break;
        }
    }
    if(flag==0)
        printf("Not Perfect Square");
    else 
        printf("Perfect Square");
}
