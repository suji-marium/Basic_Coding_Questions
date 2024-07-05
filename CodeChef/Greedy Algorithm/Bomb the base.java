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
            int count=0;
            
            int a[]=new int[n];
            
            for(int j=0;j<n;j++){
                a[j]=obj.nextInt();
            }
            
            for(int j=0;j<n;j++){
                if(a[j]<x){
                    count=j+1;
                }
            }
            System.out.println(count);
        }
	}
}
