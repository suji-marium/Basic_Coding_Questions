import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner obj=new Scanner(System.in);
		
		int n=obj.nextInt();
		int k=obj.nextInt();
		obj.nextLine();
		int count=0;
		Map<String,Integer> map=new HashMap<>();
		
		//int open[]=new int[n];
		for(int i=0;i<k;i++){
		    String a=obj.nextLine();
		    //System.out.println(a);
		    if(a.equals("CLOSEALL")){
		        count=0;
		        map.clear();
		    }
		    else if(!map.containsKey(a)){
		        map.put(a,1);
		        count++;
		    }
		    else {
		        map.remove(a);
		        count--;
		    }
		    System.out.println(count);
		    
		}

	}
}
