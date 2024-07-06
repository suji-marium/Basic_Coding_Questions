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
		    
		    String word=obj.nextLine();
		    
		    char a[]=word.toCharArray();
		    int count=0,flag=0;
		    
		    for(int j=0;j<a.length;j++){
		        if(a[j]=='1'){
		            count++;
		        }
		        if( (count*100)/(j+1)>=50){
		            flag=1;
		            break;
		        }
		    }
		    
		    if(flag==1){
		        System.out.println("yes");
		    }
		    else{
		        System.out.println("no");
		    }
		}

	}
}
