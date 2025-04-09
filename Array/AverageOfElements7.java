// Print Average of all elements from array. 
public class AverageOfElements7 {
    public static float avgOfSum(int[] arr){
        float sum=0;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        return sum/arr.length;
    }
    public static void main(String[] args) {
        int[] arr={2,4,1,6,2,6,8,1};
        System.out.println(avgOfSum(arr));
    }
}
