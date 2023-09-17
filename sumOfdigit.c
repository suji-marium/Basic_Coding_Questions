#include <stdio.h>

int main()
{
    int num,s=0,rem;
    scanf("%d",&num);
    
    while(num!=0)
    {
        rem=num%10;
        s+=rem;
        num=num/10;
    }
    printf("%d",s);
}
