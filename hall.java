import java.util.Scanner;
public class hall{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []= new int[n];
        for(int i=0;i<n;i++){
            a[i] =sc.nextInt();
        } 
        for(int i=0;i<n-1;i++){
        if(a[i]==0 && a[i+1]==0){
            a[i+1]=-1;
            if(i+2<n){
            a[i+2]=-1;
            }
            
        }

    }
    for(int i=0;i<n;i++){
if(arr[i]==-1)System.out.print("x ");
else System.out.print(arr[i]+" ");
}
System.out.println();
int count=0;
for(int i=0;i<n;i++){
if(arr[i]==0||arr[i]==1)count++;
}
System.out.println(count);
    }
}
    