#include <stdio.h>

int main()
{
    int x[]={1,2,3,4,1,8,4,9};
    
    int n=sizeof(x)/sizeof(x[0]);
    
    for(int i=0;i<n;i++)
    {
        int c=0;
        for(int j=0;j<n;j++)
        {
            if(x[i]==x[j])
            {
                c++;
            }
        }
        if(c==1)
            printf("%d",x[i]);
    }
}
