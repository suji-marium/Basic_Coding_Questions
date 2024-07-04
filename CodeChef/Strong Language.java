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
		    int k=obj.nextInt();
		    int flag=0;
		    obj.nextLine();
		    String word=obj.nextLine();
		    int count=0;
		    
		    for(char ch:word.toCharArray()){
		        if(ch=='*'){
		            count++;
		        }
		        else{
		            count=0;
		        }
		        if(count>=k){
		            flag=1;
		            break;
		        }
		    }
		    
		    if(flag==1){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}

	}
}
