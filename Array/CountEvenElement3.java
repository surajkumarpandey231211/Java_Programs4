// count all even elements from array.
public class CountEvenElement3 {
    public static int printCountOfEvenDigit(int[] arr){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={23,12,13,15,98,2,54,65};
        System.out.println("Count of even number is: "+printCountOfEvenDigit(arr));
    }
    
}
