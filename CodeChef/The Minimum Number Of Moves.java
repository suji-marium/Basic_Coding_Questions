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
		    int count =0;
		    for(int j=0;j<n;j++){
		        a[j]=obj.nextInt();
		        
		    }
		    Arrays.sort(a);
		    for(int j=1;j<n;j++){
		        while(a[j]!=a[j-1]){
		            count++;
		            a[j]=a[j]-1;
		        }
		    }
		    System.out.println(count);
		    
		}

	}
}
