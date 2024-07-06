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
		    
		    int result=Integer.bitCount(n);
		    System.out.println(result-1);
		    
		}

	}
}
