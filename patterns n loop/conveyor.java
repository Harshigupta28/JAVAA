import java.util.Scanner;
public class conveyor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int C =sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int currentweight=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(currentweight+a[i]<=C){
                currentweight+=a[i];
                count++;
                if(a[i]%5==0){
                    i++;
                }
            }else{
                currentweight=0;
                i--;
            }
        }System.out.println("Loaded"+count);
        System.out.println("Final weight"+currentweight);
    }
}