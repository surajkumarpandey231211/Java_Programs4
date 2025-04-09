import java.util.Scanner;
public class CkeckAlphabetOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch=sc.next().charAt(0);
        if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){
            System.out.println(ch+" is character...");
        }
        else{
            System.out.println(ch+" is not character...");
        }
        
    }
    
}
