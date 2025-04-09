import java.util.Scanner;
public class QuadriticEquation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a: ");
       double a=sc.nextDouble();
       System.out.println("Enter the value of b: ");
        double b=sc.nextDouble();
        System.out.println("Enter the value of c: ");
        double c=sc.nextDouble();
        double d=b*b-4*a*c;
        if(d==0){
            System.out.println("both roots are same");
            double r1=(-b)/(2*a);
        }
        else if(d>0){
            System.out.println("both roots are different");
            double r1=(-b+Math.sqrt(d))/(2*a);
            double r2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("Root1 is: "+r1);
            System.out.println("Root2 is: "+r2);
        }
        else{
            System.out.println("Real roots are not possible..");
        }
    }

    
}
