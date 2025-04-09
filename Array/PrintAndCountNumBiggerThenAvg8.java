// WAJP to print and count all the elements of array 
// which are bigger than average value. 
public class PrintAndCountNumBiggerThenAvg8 {
    public static void printBiggerElementThenAvg(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
            float avg=sum/arr.length;
            if(arr[i]>avg){
                System.out.println(arr[i]);
            }
        }
    }
public static void main(String[] args) {
    int[] arr={3,11,4,12,5};
    printBiggerElementThenAvg(arr);
}
}
