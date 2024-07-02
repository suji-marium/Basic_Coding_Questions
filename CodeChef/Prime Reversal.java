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
		    int n=obj.nextInt();
		    obj.nextLine();
		    String a=obj.nextLine();
		    String b=obj.nextLine();   

		    Map<Character,Integer> map1=new HashMap<>();
		    Map<Character,Integer> map2=new HashMap<>();
		    
		    char c[]=a.toCharArray();
		    char d[]=b.toCharArray();
		    
		    for(int j=0;j<c.length;j++){ 
		        map1.put(c[j],map1.getOrDefault(c[j],0)+1);
		        map2.put(d[j],map2.getOrDefault(d[j],0)+1);
		    }
		    
		    if(map1.equals(map2))
		        System.out.println("Yes");
		    else
		        System.out.println("No");
		}

	}
}
