#include <stdio.h>

int main()

{
    int size;
    printf("Enter size of array: ");
    scanf("%d",&size);
    
    int a[size],count[size];
    printf("Enter array elements: ");
    for(int i=0;i<size;i++)
    {
        scanf("%d",&a[i]);
        count[i]=1;
    }
    
    for(int i=0;i<size;i++)
    {
        for(int j=i+1;j<size;j++)
        {
            if(a[i]==a[j])
            {
                count[i]+=1;
                count[j]=0;
            }
        }
    }
    
    for(int i=0;i<size;i++)
    {
        if(count[i]>0)
            printf("\n%d: %d\n",a[i],count[i]);
    }
}
