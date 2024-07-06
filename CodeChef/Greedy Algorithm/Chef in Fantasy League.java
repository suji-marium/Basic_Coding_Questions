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
		    int s=obj.nextInt();
		    
		    int a[]=new int[n];
		    int b[]=new int[n];
		    
		    for(int j=0;j<n;j++){
		        a[j]=obj.nextInt();
		    }
		    
		    for(int j=0;j<n;j++){
		        b[j]=obj.nextInt();
		    }
		    
		    int minD=Integer.MAX_VALUE;
		    int minF=Integer.MAX_VALUE;
		    
		    for(int j=0;j<n;j++){
		        if(b[j]==0){
		            minD=Math.min(minD,a[j]);
		        }
		        else{
		            minF=Math.min(minF,a[j]);
		        }
		    }
		    
		    int remaining=100-s;
		    
		     
		    if(minD+minF<=remaining && minD!=Integer.MAX_VALUE && minF!=Integer.MAX_VALUE){
		        System.out.println("yes");
		    }
		    else{
		        System.out.println("no");
		    }
		}

	}
}
