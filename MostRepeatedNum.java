import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	  int temp;
	  Scanner obj=new Scanner(System.in);
	  int n=obj.nextInt();
	  int a[]=new int[n];
	  for(int i=0;i<n;i++){
	      a[i]=obj.nextInt();
	  }	  
	  
	  Map<Integer,Integer> eleFreq=new HashMap<>();
	  
	  for(int i=0;i<n;i++){
	      if(eleFreq.containsKey(a[i])){
	          int val=eleFreq.get(a[i]);
	          eleFreq.put(a[i],val+1);
	      }
	      
	      else{
	          eleFreq.put(a[i],1);
	      }
	  }
	  System.out.println(eleFreq);
	  
	  int mostRepeatednum=0;
	  int maxFreq=0;  
	  for(Map.Entry<Integer,Integer> entry:eleFreq.entrySet()){
	      if(entry.getValue()>maxFreq){
	          maxFreq=entry.getValue();
	          mostRepeatednum=entry.getKey();
	      }
	  }
	  System.out.println(mostRepeatednum);

	}	  
}
