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
		    int flag=0;
		    int n=obj.nextInt();
		    obj.nextLine();
		    String word=obj.nextLine();
		    
		    char[] a=word.toCharArray();
		    
		    Map<Character,Integer> map=new HashMap<>();
		    
		    for(int j=0;j<a.length;j++){
		        map.put(a[j],map.getOrDefault(a[j],0)+1);
		    }

		    for(int j=0;j<a.length;j++){
		        if(map.get(a[j])%2!=0){
		            flag=1;
		            break;
		        }
		    }
		    
		    if(flag==0){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}

	}
}
