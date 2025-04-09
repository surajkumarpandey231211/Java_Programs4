import java.util.Scanner;
public class PrintAllEqual {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of num1: ");
        int num1=sc.nextInt();
        System.out.println("Enter the value of num2: ");
        int num2=sc.nextInt();
        System.out.println("Enter the value of num3: ");
        int num3=sc.nextInt();
        if(num1==num2 && num2==num3){
            System.out.println("all are equals....");
        }
        else{
            System.out.println("All are not equals....");
        }

    }
    
}
