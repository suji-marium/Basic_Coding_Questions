import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        
        int t=obj.nextInt();
        obj.nextLine();
        for(int i=0;i<t;i++){
            String word=obj.nextLine();
            char[] a=word.toCharArray();
            int count=0;
            int flag=0;
            
            for(int j=0;j<a.length;j++){
                if(a[j]=='a' || a[j]=='e' || a[j]=='i' || a[j]=='o' || a[j]=='u')
                {
                    count++;
                }
                else{
                    count=0;
                }
                
                if(count>2)
                {
                    flag=1;
                    break;
                } 
            }
            
            if(flag==1)
            {
                System.out.println("Happy");
            }
            
            else {
                System.out.println("Sad");
            }
        }
        
    }
}
