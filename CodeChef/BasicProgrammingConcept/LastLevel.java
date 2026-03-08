// Chef is playing a videogame, and is getting close to the end. He decides to finish the rest of the game in a single session.
// There are X levels remaining in the game, and each level takes Chef Y minutes to complete. 
// To protect against eye strain, Chef also decides that every time he completes 3 levels, 
// he will take a Z minute break from playing. Note that there is no need to take this break if the game has been completed.
// How much time (in minutes) will it take Chef to complete the game?

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();

		for (int i=0; i<n; i++){
		    int result = 0;
		    int x = obj.nextInt();
		    int y = obj.nextInt();
		    int z = obj.nextInt();
		    
		    
	        while (x > 3)
	        {
	            result += 3 * y + z;
	            x = x - 3;
	        }
	       result += x * y;
	       System.out.println(result);
		}

	}
}
