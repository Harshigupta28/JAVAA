package java;
public class pattern {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = 5;
        while( row<=star){ 
           int i=1;
           while(i<=star){
            System.out.print("* ");
            i++;
           } 
           row++;
           System.out.println();
        }
    }
    
}
