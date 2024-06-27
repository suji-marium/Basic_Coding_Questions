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
		    int count=0;
		    int l=obj.nextInt();
		    int r=obj.nextInt();
		    for(int j=l;j<=r;j++){
		        int x=j%10;
		        if(x==2 || x==3 || x==9){
		            count++;
		        }
		    }
		    System.out.println(count);
		}

	}
}
