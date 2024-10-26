import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner obj=new Scanner(System.in);
		int k=obj.nextInt();
		int n=obj.nextInt();
		obj.nextLine();
		
		String fs[]=new String[k];
		
		for(int i=0;i<k;i++){
		    fs[i]=obj.nextLine();
		}
		
		String ps[]=new String[n];
		
		for(int j=0;j<n;j++){
		    int flag=0;
		    ps[j]=obj.nextLine();
		    
		    for(int i=0;i<k;i++){
		        //System.out.println(fs[i]);
		        if(ps[j].contains(fs[i])){
		            flag=1;
		            break;
		        }
		        //System.out.println(ps[j].length());
		        //System.out.println(String.valueOf(ps[j].length()));
		        if(ps[j].length()>=47){
		            flag=1;
		            break;
		        }
		    }
		    
		    if(flag==1){
		        System.out.println("Good");
		       
		    }
		    
		    else{
		        System.out.println("Bad");
		    }
		}
		

	}
}
