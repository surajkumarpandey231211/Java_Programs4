// print and count all three-digit numbers from array. 
public class PrintAndCount3Digit5 {
    public static void printAndCountThreeDigit(int[] arr){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=100 && arr[i]<=999){
                System.out.print(arr[i]+" ");
                count++;
            }
        }
        System.out.println("\nCount is:"+count);
    }
    public static void main(String[] args) {
        int[] arr={21,463,172,76,34,987,6,90,543};
        printAndCountThreeDigit(arr);
    }
}

// output: 463 172 987 543
    //     Count is:4
