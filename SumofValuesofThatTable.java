import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner obj=new Scanner(System.in);
	    int n=obj.nextInt();
	    
	    int result=0;
	    
	    for(int i=1;i<=10;i++){
	        result=n*i+result;
	    }
	  
	    System.out.print(result);
	}
	  

}
