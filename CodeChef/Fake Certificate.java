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
		    obj.nextLine();
		   
		    String letter=obj.nextLine();
		    char[] a=letter.toCharArray();
		    
		    int maxcount=0,count=0,count1=0;
		    for(int j=0;j<a.length;j++){
		        
		        if(a[j]=='1'){
		            count1++;
		        }
		        
		        if(a[j]=='0'){
		            count++;
		        }
		        
		        else{
		           count=0; 
		        }
		        maxcount=Math.max(count,maxcount);
		    }
		    
		    System.out.println(maxcount+count1);
		}
	}
}
