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
		    int y=obj.nextInt();
		    obj.nextLine();
		    
		    int count=0,maxcount=0,result=0;
		    String bString=obj.nextLine();
		    
		    char a[]=bString.toCharArray();
		    
		    for(int j=0;j<a.length;j++){
		        if(a[j]=='1'){
		            count++;
		            result=result+x;
		        }
		        else{
		            count=0;
		        }
		        maxcount=Math.max(count,maxcount);
		    }
		    System.out.println(result+maxcount*y);
		}
	}
}
