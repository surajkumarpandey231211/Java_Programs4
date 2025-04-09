// Access all even elements from array. 
public class PrintAllEvenElement2 {
    public static void printEvenIndexDigit(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(i%2==0){
               System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={62,12,43,53,21,32};
        printEvenIndexDigit(arr);
    }
}
