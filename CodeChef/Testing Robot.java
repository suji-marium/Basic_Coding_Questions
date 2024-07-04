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
		    int x=obj.nextInt();
		    obj.nextLine();
		    String word=obj.nextLine();
		    
		    Set<Integer> set=new HashSet<>();
		    set.add(x);
		    for(char ch:word.toCharArray()){
		        if(ch=='L'){
		            x-=1;
		            set.add(x);
		        }
		        else if(ch=='R'){
		            x+=1;
		            set.add(x);
		        }
		    }
		    System.out.println(set.size());
		    
		}

	}
}
