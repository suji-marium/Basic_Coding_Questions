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
		    int d[]=new int[n];
		    
		    for(int j=0;j<n;j++){
		        a[j]=obj.nextInt();
		    }
		    
		    for(int j=0;j<n;j++){
		        d[j]=obj.nextInt();
		    }
		    
		    Map<Integer,Integer> map=new HashMap<>();
		    
		    for(int j=0;j<n;j++){
		        map.put(a[j],map.getOrDefault(a[j],0)+1);
		    }
		    
		    for(int j=0;j<n;j++){
		        map.put(d[j],map.getOrDefault(d[j],0)+1);
		    }
		    int count=Collections.max(map.values());
		    System.out.println(count);
		    
		}

	}
}
