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
		    String s=obj.nextLine();
		    String r=obj.nextLine();
		    
		    char[] sc=s.toCharArray();
		    char[] rc=r.toCharArray();
		    
		    int[] count1=new int[2];
		    int[] count2=new int[2];
		    
		    for(int j=0;j<n;j++){
		        if(sc[j]=='1'){
		            count1[1]+=1;
		        }
		        else{
		            count1[0]+=1;
		        }
		        if(rc[j]=='1'){
		            count2[1]+=1;
		        }
		        else{
		            count2[0]+=1;
		        }
		        
		    }
		    
		    if(count1[0]==count2[0] && count1[1]==count2[1]){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}

	}
}
