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
		    
		    int[][] a=new int[n][n];
		    
		    for(int j=0;j<n;j++){
		        for(int k=0;k<=j;k++){
		            a[j][k]=obj.nextInt();
		        }
		    }
		    
		    for(int j=n-2;j>=0;j--){
		        for(int k=0;k<=j;k++){
		            a[j][k]+=Math.max(a[j+1][k],a[j+1][k+1]);
		        }
		    }
		    System.out.println(a[0][0]);
		}
	}
}
