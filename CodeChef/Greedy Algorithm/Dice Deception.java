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
		    int k=obj.nextInt();
		    
		    int a[]=new int[n];
		    
		    for(int j=0;j<n;j++){
		        a[j]=obj.nextInt();
		    }
		    Arrays.sort(a);
		    int sum=0,flip=k;
		    for(int j=0;j<n;j++){
		        if(a[j]<=3 && flip>0){
		            a[j]=7-a[j];
		            flip--;
		        }
		        
		        sum+=a[j];
		        //System.out.println(sum);
		    }
		    
		    System.out.println(sum);
		}
	}
}
