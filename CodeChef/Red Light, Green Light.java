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
		    int count=0;
		    int n=obj.nextInt();
		    int k=obj.nextInt();
		    int[] h=new int[n];
		    for(int j=0;j<n;j++){
		        h[j]=obj.nextInt();
		    }
		    
		    for(int j=0;j<n;j++){
		        if(h[j]>k){
		            count++;
		        }
		    }
		    System.out.println(count);
		}

	}
}
