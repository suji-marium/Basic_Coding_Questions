import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    private static Map<Long,Long> map=new HashMap<>();
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner obj=new Scanner(System.in);
		
		while(obj.hasNextLong()){
		    long n=obj.nextLong();
		    System.out.println(maxDollar(n));
		}
		
	}
	
	private static long maxDollar(long n){
	    if(n==0)
	        return 0;
	   if(map.containsKey(n))
	        return map.get(n);
	        
	  
	    long maxValue=Math.max(n,maxDollar(n/2)+maxDollar(n/3)+maxDollar(n/4));
	    map.put(n,maxValue);
	    return maxValue;
	    
	}
}
