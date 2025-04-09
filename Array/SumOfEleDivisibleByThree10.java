public class SumOfEleDivisibleByThree10 {
    public static int printSumOfElementDivisibleByThree(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%3==0){
                sum=sum+arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr={1,3,6,12,4,9};
        System.out.println(printSumOfElementDivisibleByThree(arr));
    }
}
