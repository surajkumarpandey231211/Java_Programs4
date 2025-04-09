import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c;
       do{
        System.out.println("Press 1=>For Factorial calculation");
        System.out.println("Press 2=>For Power calculation");
        System.out.println("Press 3=>To Generate Multiplication Table up to n numbers");
        System.out.println("Press 4=>To Generate Fibonacci Series");
        System.out.println("Press 5=>To Check Prime Number");
        System.out.println("Press 6=>To Reverse a number");
        System.out.println("Press 7=>To check Palindrome Number");
        System.out.println("Press 8=>To Calculate total arrangements");
        System.out.println("Press 9=>To Calculate total Selections");
        System.out.println("Press 10=>To Generate nth Row of Pascal Triangle");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
            System.out.println("You have selected Factorial Operation");
            System.out.println("Enter the number: ");
            int n1=sc.nextInt();
            int fact=NumberOperations.fact(n1);
            System.out.println(n1+"!="+fact);
            break;

            case 2:   
            System.out.println("You have selected powre Operation");
            System.out.println("Enter a: ");
            int a=sc.nextInt();
            System.out.println("Enter b: ");
            int b=sc.nextInt();
            int pow=NumberOperations.power(a,b);
            System.out.println(a+" to the power"+b+" is: "+pow);     
            break;

            case 3:   
            System.out.println("You have selected Multiplication table Operation");
            System.out.println("Enter the number: ");
            int n3=sc.nextInt();
            NumberOperations.printTable(n3);     
            break;

            case 4:   
            System.out.println("You have selected Fibonacci series Operation");
            System.out.println("Enter the number: ");
            int n4=sc.nextInt();
            NumberOperations.fibonacciSeries(n4);   
            break;

            case 5:   
            System.out.println("You have selected Prime Operation");
            System.out.println("Enter the number: ");
            int n5=sc.nextInt();
            boolean prime=NumberOperations.isPrime(n5);
            System.out.println(prime);   
            break;

            case 6:   
            System.out.println("You have selected Reverse Number Operation");
            System.out.println("Enter the number: ");
            int n6=sc.nextInt();
            boolean reverse=NumberOperations.isPrime(n6);
            System.out.println(reverse);   
            break;

            case 7:   
            System.out.println("You have selected Palindrome Operation");
            System.out.println("Enter the number: ");
            int n7=sc.nextInt();
            boolean palindrome=NumberOperations.isPalindrome(n7);
            System.out.println(palindrome);   
            break;

            case 8:   
            System.out.println("You have selected Arrangement Operation");
            System.out.println("Enter n: ");
            int n8=sc.nextInt();
            System.out.println("Enter r: ");
            int r1=sc.nextInt();
            int arrange=NumberOperations.calcArrangement(n8,r1);
            System.out.println("Total arrangement is: "+arrange);   
            break;

            case 9:   
            System.out.println("You have selected Selection Operation");
            System.out.println("Enter n: ");
            int n9=sc.nextInt();
            System.out.println("Enter r: ");
            int r2=sc.nextInt();
            int select=NumberOperations.calcSelection(n9,r2);
            System.out.println("Total selection is: "+select);   
            break;

            case 10:   
            System.out.println("You have selected Pascal Trangle's Operation");
            System.out.println("Enter the number: ");
            int n10=sc.nextInt();
            NumberOperations.nthRowOfPascalTrangle(n10);  
            break;
        }
        System.out.println("Enter Y/y to continue operation...");
        c=sc.next().charAt(0);
    }while(c=='Y' || c=='y');  
    System.out.println("========Program ends=======");
    }
}