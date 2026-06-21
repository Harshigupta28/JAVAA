 import java.util.Scanner;
 public class serverprob {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
         int servera=0;
        for( int i=0;i<a;i++){
             int x = sc.nextInt();
             if(i%2==0){
                servera+=x;

             }
        }
        System.out.println(servera);
        





        
        
    }

    
}
