// Print sum of all elements from array. 

public class SumOfElements6 {
    public static int sumOfElements(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr={2,4,1,6,2,3};
        int sum=sumOfElements(arr);
        System.out.println("Sum of array is: "+sum);
    }
    
}
// output: Sum of array is: 18
