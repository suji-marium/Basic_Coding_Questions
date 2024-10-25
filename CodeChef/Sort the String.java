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
	        int c=0;
	        String s=obj.nextLine();
	        
	        char ch[]=s.toCharArray();
	  
        	for(int j=0;j<n-1;j++){
        	   if(ch[j]>ch[j+1]){
        	           c=c+1;
        	   }
        	}
        	        
            System.out.println(c);
	    }

	}
}
