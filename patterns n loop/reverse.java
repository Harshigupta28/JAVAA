public class reverse {
    public static void main (String[] args){
        int n = 280105;
         while(n>0){
            int digit = n%10;
            n=n/10;
            System.out.print(digit);
         }

    }
    
}
