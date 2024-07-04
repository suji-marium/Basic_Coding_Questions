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
		    String word=obj.nextLine();
		    int flag=0;
		    Map<Character,Integer> map=new HashMap<>();
		    
		    for(char ch:word.toCharArray()){
		        map.put(ch,map.getOrDefault(ch,0)+1);
		    }
		    //System.out.println(map);
		    
		    for(int x:map.values()){
		        //System.out.println(x);
		        if(x==1){
		            flag=1;
		            break;
		        }
		    }
		    
		    if(flag==1){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }	    
		}

	}
}
