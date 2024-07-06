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
		    String s=obj.nextLine();
		    
		    Set<String> set=new HashSet<>();
		    
		    for(int j=0;j<s.length()-1;j++){
		        String sub=s.substring(j,j+2);
		        set.add(sub);
		    }
		    //System.out.println(set);
		    System.out.println(set.size());
		   
		}

	}
}
