import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner obj=new Scanner(System.in);
		
		int t=obj.nextInt();
		
		for(int i=0;i<t;i++){
		    int n=obj.nextInt();
		    
		    int a[]=new int[n+1];
		    
		    for(int j=1;j<=n;j++){
		        a[j]=obj.nextInt();
		    }
		    Arrays.sort(a);
		    int sum=0;
		    
		    if(n%2!=0) {
		        for(int j=n;j>=1;j--)
		        {
		            if(Math.ceil(n/2.0)<=j){
		                sum+=a[j];
		            }
    		        else{
    		            sum-=a[j];
    		        }
		        }
		    }
		    
		    else{
		        for(int j=n;j>=1;j--)
		        {
		            if(n/2<j){
		                sum+=a[j];
		            }
    		        else{
    		            sum-=a[j];
    		        }
		        }
		    }
		    
		    System.out.println(sum);
		    
		}

	}
}
