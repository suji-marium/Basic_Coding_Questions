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
		    
		    int c1=0,c0=0;
		    
		    char c[]=s.toCharArray();
		    for(int j=0;j<s.length();j++){
		        if(c[j]=='1'){
		            c1=c1+1;
		        }
		        if(c[j]=='0'){
		            c0=c0+1;
		        }
		    }
		    
		    if(c1>c0){
		        System.out.println("WIN");
		    }
		    else{
		        System.out.println("LOSE");
		    }
		    
		}

	}
}
