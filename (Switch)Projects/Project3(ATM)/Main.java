import java.util.*;
public class Main{
    static int balance=10000;
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       char c;
       do{
        System.out.println("Enter the ");
         System.out.println("Enter Y/y to continue...");
         c=sc.next().charAt(0);
       }while(c=='Y' || c=='y');
    }
}