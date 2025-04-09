// Access all elements of array from end. 
public class AccessAllElementFromEnd4 {
    public static void accessElementFromEnd(int[] arr){
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={54,12,98,34,21,65,87};
        accessElementFromEnd(arr);
    }
}

// output: 87 65 21 34 98 12 54 
