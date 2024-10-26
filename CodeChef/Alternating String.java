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
		    String s=obj.nextLine();
		    
		    char ch[]=s.toCharArray();
		    int c0=0,c1=0;
		    
		    for(int j=0;j<n;j++){
		        if(ch[j]=='0'){
		            c0++;
		        }
		       
		        if(ch[j]=='1'){
		            c1++;
		        }
		        
		    }
		    
		    int res;
		    if(c0==c1){
		        res=2*c0;
		    }
		    
		    else{
		        res=2*Math.min(c0,c1)+1;
		    }
		    
		    System.out.println(res);
		}

	}
}
