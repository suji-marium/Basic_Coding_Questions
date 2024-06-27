import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
		for(int i=0;i<t;i++){
		    int n=obj.nextInt();
		    BigInteger fact=BigInteger.ONE;
		    for(int j=1;j<=n;j++){
		        fact=fact.multiply(BigInteger.valueOf(j));
		    }
		    System.out.println(fact);
		}

	}
}
