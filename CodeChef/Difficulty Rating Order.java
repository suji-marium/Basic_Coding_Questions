import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i=0;i<t;i++){
            int flag=0;
            int n=scanner.nextInt();
            int[] a=new int[n];
            
            for(int j=0;j<n;j++){
                a[j]=scanner.nextInt();
            }
            
            for(int j=1;j<n;j++){
                if(a[j]<a[j-1]){
                    flag=1;
                    break;
                }
            }
            
            if(flag==0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");    
            }
        }
    }
}
