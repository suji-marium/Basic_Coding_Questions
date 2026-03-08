import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner obj = new Scanner(System.in);
		int x = obj.nextInt();
		int y = obj.nextInt();
		int z = obj.nextInt();
		int a = obj.nextInt();
		
		List<Integer> lt = new ArrayList<>();
		lt.addAll(List.of(x, y, z));
		
		if (lt.contains(a))
		    System.out.println("Yes");
		else
		    System.out.println("No");
		

	}
}
