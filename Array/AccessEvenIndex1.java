// Access all even index elements from array.

public class AccessEvenIndex1 {
    public static void accessEvenIndex(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={32,54,65,98,90,12,54};
       accessEvenIndex(arr);
    }
}
