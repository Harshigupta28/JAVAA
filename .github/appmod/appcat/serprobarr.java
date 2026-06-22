 import java.util.Scanner;
 public class serprobarr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int servera=0;
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
        arr[i]=sc.nextInt();
        if(i%2==0){
            servera+=arr[i];
        }
    }
    System.out.println(servera);
        
    }
}