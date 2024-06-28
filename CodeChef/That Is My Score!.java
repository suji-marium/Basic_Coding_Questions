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
            int p[]=new int[n];
            int s[]=new int[n];
            int totalScore=0;
            
            Map<Integer,Integer> map=new HashMap<>();
            
            for(int j=0;j<n;j++){
                p[j]=obj.nextInt();
                s[j]=obj.nextInt();
                if(!map.containsKey(p[j]))
                    map.put(p[j],s[j]);
                else{
                    map.put(p[j],Math.max(s[j],map.get(p[j])));
                }
                
            }
            
            
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                if(entry.getKey()<=8){
                    totalScore+=entry.getValue();
                }
            }
            System.out.println(totalScore);
        }

	}
}
