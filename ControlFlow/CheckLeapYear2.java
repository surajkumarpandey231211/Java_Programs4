import java.util.Scanner;
public class CheckLeapYear2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the yera: ");
        int year=sc.nextInt();
        if(year%100 !=0 && year%4==0 || year%400==0){
            System.out.println(year+" is a Leap Year...");
        }
        else{
            System.out.println(year+" is not a Leap Year...");
        }

    }
    
}
