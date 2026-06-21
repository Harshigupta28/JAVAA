import java.util.Scanner;
public class clap{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]=new int[n];
        for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
        }
        int clap=0;
        int checked=0;
        int consecutive=0;
        for(int i=0;i<n;i++){
            checked++;
            if(a[i]%2==0){
                clap++;
                consecutive++;
            }else{
                consecutive=0;
            }
            if(consecutive==3){
                i++;
                consecutive =0;
            }
        }System.out.println("clap:"+clap);
        System.out.println("checked:"=checked);

            
        }


        
    }

