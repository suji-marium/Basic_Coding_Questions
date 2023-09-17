#include <stdio.h>

int main()
{
    int n;
    printf("Enter the nth term: ");
    scanf("%d",&n);
    
    int n1=0,n2=1,nt;
    
    for(int i=0;i<n;i++)
    {
        printf("%d\t",n1);
        nt=n1+n2;
        n1=n2;
        n2=nt;
    }
}
