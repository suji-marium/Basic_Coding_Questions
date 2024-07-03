import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{ 
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
		obj.nextLine();
		
		for(int i=0;i<t;i++){
		    String word1=obj.nextLine();
		    String word2=obj.nextLine();
		    int count=0;
		    Map<Character,Integer> map1=new HashMap<>();
		    Map<Character,Integer> map2=new HashMap<>();
		    
		    for(char ch : word1.toCharArray()){
		        map1.put(ch,map1.getOrDefault(ch,0)+1);
		    }
		    
		    for(char ch:word2.toCharArray()){
		        map2.put(ch,map2.getOrDefault(ch,0)+1);
		    }
		    
		    for(Map.Entry<Character,Integer> entry:map1.entrySet()){
		        char ch=entry.getKey();
		        if(map2.containsKey(ch)){
		            count+=Math.min(map2.get(ch),entry.getValue());
		        }
		    }
		    System.out.println(count);
		}

	}
}
