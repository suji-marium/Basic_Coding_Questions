import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        obj.nextLine();
        for (int i = 0; i < t; i++) {
            String a[] = obj.nextLine().split(" ");
            String str1=a[0];
            String str2=a[1];
            
            if(isSubsequence(str1,str2) || isSubsequence(str2,str1)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        obj.close();
    }
    
    public static boolean isSubsequence(String a,String b){
        int j=0;
        for(int i=0;j<a.length() && i<b.length();i++){
            if(a.charAt(j)==b.charAt(i)){
                j++;
            }
            
        }
        
        return a.length()==j;
    }
}
