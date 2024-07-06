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
		    int x=obj.nextInt();
		    int y=obj.nextInt();
		    int n=obj.nextInt();
		    int r=obj.nextInt();
		    
		    //int maxiPremiumBurger,remainingBudget,normalBurger;
		    if(x*n>r){
		        System.out.println(-1);
		        continue;
		    }
		    
		    int maxiPremiumBurger=Math.min(n,r/y);
		    
		    while(maxiPremiumBurger>=0){
		        int remainingBudget=r-maxiPremiumBurger*y;
		        int normalBurger=n-maxiPremiumBurger;
		        
		        if(normalBurger*x<=remainingBudget){
		            System.out.println(normalBurger + " " + maxiPremiumBurger);
                    break;
		        }
		        maxiPremiumBurger--;
		    }
		    if (maxiPremiumBurger < 0) {
                System.out.println("-1");
            }
		    
		}

	}
}
