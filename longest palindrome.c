#include <stdio.h>

int main()
{
    int arr[] = {1, 121, 55551,545545, 10111, 90};
    int res,len=0;
    int n=sizeof(arr)/sizeof(arr[0]);

    for(int i=0;i<n;i++)
    {
        int temp=arr[i],rev=0,rem,c=0;
        while(temp!=0)
        {
            rem=temp%10;
            rev=rev*10+rem;
            temp/=10;
            c++;
           
        }
        if(arr[i]==rev && len<c)
        {
            len=c;
            res=arr[i];
        }
    }
    printf("%d",res);
}
