#include <stdio.h>
#include <math.h>
int main()
{
    int bin,c=0,res=0,rem;
    printf("Enter the binary number: ");
    scanf("%d",&bin);
    
    int temp=bin;
    while(temp!=0)
    {
        c++;
        temp/=10;
    }
    
    for(int i=0;i<c;i++)
    {
       rem=bin%10;
       res=res+pow(2,i)*rem;
       bin/=10;
   }
   printf("%d",res);
}
