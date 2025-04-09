import java.util.Scanner;
public class CheckTrangleEquilateralIsoscelesScalene {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter he side1: ");
    int side1=sc.nextInt();
    System.out.println("Enter he side2: ");
    int side2=sc.nextInt();
    System.out.println("Enter he side3: ");
    int side3=sc.nextInt();
    if(side1==side2 && side2==side3 && side1==side3 ){
        System.out.println("The trangle is equilateral...");
    }
    else if(side1==side2 || side2==side3 || side1==side3){
        System.out.println("The trangle is isosceles trangle...");
    }
    else{
        System.out.println("The trangle is scalene trangle...");
    }
    } 
}
