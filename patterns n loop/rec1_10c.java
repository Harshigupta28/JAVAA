import java.util.Scanner;
 public class rec1_10c{
    public static void printinc(int n,int a){
        if (n==a+1){
            
            return;
        }
        
        System.out.println(n);
        printinc(n+1,a);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        printinc(1,a);
    }
}