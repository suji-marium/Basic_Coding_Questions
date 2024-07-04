import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		
		int a[]=new int[n];
		
		for(int i=0;i<n;i++){
		    a[i]=obj.nextInt();
		}
		
		int freq[]=new int[n+1];
		
		for(int i=0;i<n;i++){
		    freq[a[i]]++;
		}
		
		for(int i=0;i<=n;i++){
		    if(freq[i]==0){
		        System.out.print(i+" ");
		    }
		}
	}
}
