import java.util.Scanner; 
public class CheckValidTrangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side1: ");
        int side1=sc.nextInt();
        System.out.println("Enter the side2: ");
        int side2=sc.nextInt();
        System.out.println("Enter the side3: ");
        int side3=sc.nextInt();
        if(side1+side2>side3 && side2+side3>side1 && side1+side3>side2){
            System.out.println("Valid trangle...");
        }
        else{
            System.out.println("Not a valid trangle...");
        }
    }
    
}
