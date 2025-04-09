// Print sum of all even elements from array.
public class SumOfAllEvenElement9 {
    public static int sumOfEvenElements(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                sum=sum+arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr={11,23,20,10,65,4};
        System.out.println("Sum of even Elements: "+sumOfEvenElements(arr));
    }
    
}
// output:Sum of even Elements: 34
