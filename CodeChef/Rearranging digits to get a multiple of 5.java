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
		    int d=obj.nextInt();
		    obj.nextLine();
		    String n=obj.nextLine();
		    int flag=0;
		    char ch[]=n.toCharArray();
		    
		    for(int j=0;j<d;j++){
		        //System.out.println(ch[j]);
		        if(ch[j]=='5' || ch[j]=='0'){
		            flag=1;
		            break;
		        }
		        
		    }
		    
		    if(flag==0){
		        System.out.println("No");
		    }
		    else{
		        System.out.println("Yes");
		    }
		    
		    
		}

	}
}
