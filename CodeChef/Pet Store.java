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
		    int[] a=new int[n];
		    int flag=0;
		    
		    
		    for(int j=0;j<n;j++){
		        a[j]=obj.nextInt();
		    }
		    
		    Map<Integer,Integer> map=new HashMap<>();
		    
		    for(int j=0;j<n;j++){
		        map.put(a[j],map.getOrDefault(a[j],0)+1);
		    }
		    
		    for(Map.Entry<Integer,Integer> entry:map.entrySet())
		    {
		        if(entry.getValue()%2!=0){
		            flag=1;
		            break;
		        }
		    }
		    if(flag==0){
		        System.out.println("YES");
		    }
		    
		    else{
		        System.out.println("NO");
		    }
		}

	}
}
