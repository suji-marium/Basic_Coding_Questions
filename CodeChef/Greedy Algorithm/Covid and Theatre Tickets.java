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
		    int r=obj.nextInt();
		    int c=obj.nextInt();
		    int count=0;
		    
		    for(int j=0;j<r;j++)
		    {
		        if(j%2==0){
		            for(int k=0;k<c;k++){
		                if(k%2==0){
		                    count++;
		                }
		            }
		        }
		    }
		                
		    System.out.println(count);
		    
		}

	}
}
