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
	        
	        HashMap<Integer,Integer> map=new HashMap<>();
	        for(int j=0;j<n;j++){
	            int dolltype=obj.nextInt();
	            map.put(dolltype,map.getOrDefault(dolltype,0)+1);
	            
	        }
	        //System.out.println(map);
	        
	        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
	            if(entry.getValue()%2!=0){
	                System.out.println(entry.getKey());
	                break;
	            }
	        }
	    }

	}
}
