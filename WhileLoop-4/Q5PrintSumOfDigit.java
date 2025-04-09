// Write a java program to take a String input and print the sum of each digit characters.
// i/p: Ab43D6DE83ht
// o/p
// Total sum of  Digit characters are: 24
import java.util.*;;
public class Q5PrintSumOfDigit {
    public static int printDigitOfString(String s){
        int sum=0;
        int i=0;
        while (i<s.length()) {
            char c=s.charAt(i);
            if(c>='0' && c<='9'){
                sum=sum+c-48;
            }
           i++; 
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine();
        System.out.println("sum of digit is: "+printDigitOfString(s));

    }
    
}
