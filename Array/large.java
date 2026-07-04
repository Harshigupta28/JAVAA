public class large {
    public static int largestNum(int numbers[]){
      int max=numbers[0];

        for(int i=1;i<numbers.length;i++){
            if(max<numbers[i]){
                max=numbers[i];
            }
        }
        return max;

    }
    public static void main(String[] args) {
        int numbers[]={1,5,7,2,9,2,4,6,};
        System.out.println("largest value: "+largestNum(numbers));
    

    }
    
}
