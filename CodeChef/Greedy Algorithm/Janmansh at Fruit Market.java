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
		    int x=obj.nextInt();
		
		    ArrayList<Integer> a=new ArrayList<>();
		    
		    for(int j=0;j<3;j++){
		        a.add(obj.nextInt());
		    }
		    
		    Collections.sort(a);
		    
		    
		    int result=a.get(0)*(x-1)+a.get(1)*1;
		    
		    System.out.println(result);
		    
		}

	}
}
