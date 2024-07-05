import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        
        for(int i = 0; i < t; i++){
            int n = obj.nextInt();
            int k = obj.nextInt();
            
            int count = 0, sum = 0;
            int[] a = new int[n];
            
            for(int j = 0; j < n; j++){
                a[j] = obj.nextInt();
            }
            
            boolean impossible = false;
            for(int j = 0; j < n; j++){
                
                if(a[j]>k){
                    impossible=true;
                    break;
                }
                
                if(a[j]+sum>k){
                    count++;
                    sum=0;
                }
                
                sum+=a[j];
            }
            
            if(impossible){
                System.out.println(-1);
            } else {
                if(sum > 0){
                    count++;
                }
                System.out.println(count);
            }
        }
        
        obj.close();
    }
}
