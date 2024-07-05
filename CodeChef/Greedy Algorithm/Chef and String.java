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
            String word=obj.nextLine();
            int count=0;
            char a[]=word.toCharArray();
            
            for(int j=0;j<a.length-1;j++){
                //System.out.println()
                if( (a[j]=='x' && a[j+1]=='y') || (a[j]=='y' && a[j+1]=='x')){
                    count++;
                    j++;
                }
            }
            
            System.out.println(count);
        }
	}
}
