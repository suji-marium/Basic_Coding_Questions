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
		    int a[]=new int[n];
		    int sum=0;
		    
		    for(int j=0;j<n;j++){
		        a[j]=obj.nextInt();
		    }
		    Arrays.sort(a);
		    int min=Integer.MAX_VALUE,diff;
		    for(int j=0;j<n-1;j++){
		        diff=a[j+1]-a[j];
		        min=Math.min(diff,min);
		    }
		    System.out.println(min);
		    
		}

	}
}
