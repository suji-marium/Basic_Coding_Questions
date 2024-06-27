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
		    int maxHappy=0,minHappy=0;
		    int n=obj.nextInt();
		    int l=obj.nextInt();
		    int r=obj.nextInt();
		    int happiness=0;
		    int a[]=new int[n];
		    for(int j=0;j<n;j++){
		       a[j]=obj.nextInt();
		       if(a[j]>=l && a[j]<=r){
		           happiness++;
		       }
		       else{
		           happiness--;
		       }
		        maxHappy=Math.max(maxHappy,happiness);
		        minHappy=Math.min(minHappy,happiness);
		  }
		  System.out.print(maxHappy + " " +minHappy);
		  System.out.println();
		}
	}
}
