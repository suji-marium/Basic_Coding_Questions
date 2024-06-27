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
		    int count=0;
		    int max=0;
		    int[] a=new int[n];
		    
		    for(int j=0;j<n;j++){
		        a[j]=obj.nextInt();
		    }
		    Map<Integer,Integer> map=new HashMap<>();
		    
		    
		    for(int j=0;j<n;j++){
		        if(!map.containsKey(a[j])){
		            map.put(a[j],1);
		            count++;
		        }
		        
		        else{
		            map.remove(a[j]);
		            count--;
		        }
		        max=Math.max(count,max);
		    }
		    System.out.println(max);
		}

	}
}
