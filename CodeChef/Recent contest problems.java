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
		    String[] a=obj.nextLine().split(" ");
		    
		    int START38Count=0;
		    int LTIME108Count=0;
		    
		    for(int j=0;j<n;j++){
		        if(a[j].equals("START38"))
		        {
		           START38Count++; 
		        }
		        else if(a[j].equals("LTIME108")){
		            LTIME108Count++;
		        }
		        
		    }
		    System.out.println(START38Count+ " " +LTIME108Count );
		    
		    
		}
	}
}
