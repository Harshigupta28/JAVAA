public class Bubble { 
    public static void bubblesort(int arr[]){
        for(int turn =0;turn<arr.length-1;turn++){// outter loop for  pass

            for(int j=0;j<arr.length-1-turn;j++){ // inner loop for  internal  fix element

                if(arr[j]>arr[j+1]){// compare
                    // swap
                     int temp= arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                }
            }

        }
    }
    public static void main(String agrs[]){
        int arr[]= {3,4,1,2,5};
        bubblesort(arr);
        // print 
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+"");
        }
    }
}