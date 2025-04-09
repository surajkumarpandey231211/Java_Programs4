import java.util.Scanner;
public class CheckUpperLowerCaseOrOther {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch=sc.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println(ch+" is Upper case character...");
        }
        else if(ch>='a' && ch<='z'){
            System.out.println(ch+" is Lower case character...");
        }
        else{
            System.out.println(ch+" is not Upper case and not Lower case character...");
        }
        
    }
    
}
