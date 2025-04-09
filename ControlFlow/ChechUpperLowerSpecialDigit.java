import java.util.Scanner;
public class ChechUpperLowerSpecialDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch=sc.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println(" Upper Case...");
        }
        else if(ch>='a' && ch<='z'){
            System.out.println(" Upper Case...");
        }
        else if(ch>='a' && ch<='z'){
            System.out.println(" Lower Case...");
        }
        else if(ch>=48 && ch<=57){//range of numeric values.
            System.out.println(ch+" Numeric character...");
        }
        else {
            System.out.println(ch+" is special character...");
        }
        
    } 
}
