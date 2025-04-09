import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c;
        do{
            System.out.println("Press 1=>To Convert Decimal Number to Binary Number");
            System.out.println("Press 2=>To Convert Binary Number to Decimal Number");
            System.out.println("Press 3=>To Convert Decimal Number to Octal Number");
            System.out.println("Press 4=>To Convert Octal Number to Decimal Number");
            System.out.println("Press 5=>To Convert Decimal Number to Hexadecimal Number");
            System.out.println("Press 6=>To Convert Hexadecimal Number to Decimal Number");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                System.out.println("You have selected Decimal to Binary Conversion");
                System.out.println("Enter the decimel number: ");
                int n1=sc.nextInt();
                String bin=Conversions.decimalToBinary(n1);
                System.out.println("Binary representation of "+n1+" is: "+bin);
                break;

                case 2:
                System.out.println("You have selected  Binary to Decimal Conversion");
                System.out.println("Enter the Binary number: ");
                sc.nextLine();
                String s=sc.nextLine();
                String dec=Conversions.binaryToDecimal(s);
                System.out.println("decimal number of "+s+" is: "+dec);
                break;

                case 3:
                System.out.println("You have selected  Decimal To Octal Conversion");
                System.out.println("Enter the decimal number: ");
                int n3=sc.nextInt();
                String oct=Conversions.decimalToOctal(n3);
                System.out.println("octal number of "+n3+" is: "+oct);
                break;

                case 4:
                System.out.println("You have selected  Octal To decimal Conversion");
                System.out.println("Enter the octal number: ");
                int n4=sc.nextInt();
                String dec1=Conversions.octalToDecimal(n4);
                System.out.println("decimal number of "+n4+" is: "+dec1);
                break;

                case 5:
                System.out.println("You have selected decimal to Hexadecimal Conversion");
                System.out.println("Enter the decimal number: ");
                int n5=sc.nextInt();
                String hexDec=Conversions.decimalToHexadecimal(n5);
                System.out.println("Hexadecimal number of "+n5+" is: "+hexDec);
                break;

                case 6:
                System.out.println("You have selected Hexadecimal to decimal Conversion");
                System.out.println("Enter the Hexadecimal number: ");
                sc.nextLine();
                String s1=sc.nextLine();
                String dec6=Conversions.hexaDecimalDecimal(s1);
                System.out.println("Decimal number of "+s1+" is: "+dec6);
                break;
                default:
                    System.out.println("Invalid case input.");
            }
            System.out.println("Enter Y/y to continue conversions...");
            c=sc.next().charAt(0);
        }while(c=='Y' || c=='y');
        System.out.println("===========Program Ends========");
    }
    
}