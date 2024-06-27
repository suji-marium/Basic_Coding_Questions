import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
		
		for(int i=0;i<t;i++){
		    int n=obj.nextInt();
		    int[] a=new int[n];
		    int count=0;
		    for(int j=0;j<n;j++){
		        a[j]=obj.nextInt();
		    }
		    
		    Map<Integer,Integer> map=new HashMap<>();
		    
		    for(int j=0;j<n;j++){
		        map.put(a[j],map.getOrDefault(a[j],0)+1);
		    }
		    count=Collections.max(map.values());
		    System.out.println(n-count);
		}

	}
}
