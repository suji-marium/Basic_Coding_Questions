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
		    int u=obj.nextInt();
		    int d=obj.nextInt();
		    
		    int a[]=new int[n];
		    
		    for(int j=0;j<n;j++){
		        a[j]=obj.nextInt();
		    }
		    
		    int para=0,count=1;
		    for(int j=1;j<n;j++){
		        if(a[j]>=a[j-1] && a[j]-a[j-1]<=u){
		            count=j+1;
		        }
		        
		        else if(a[j]<=a[j-1] && a[j-1]-a[j]<=d){
		            count=j+1;
		        }
		        
		        else if(a[j]<a[j-1] && para==0){
		            count=j+1;
		            para=1;
		        }
		        
		        else{
		            break;
		        }
		    }
		    
		    System.out.println(count);
		}

	}
}
