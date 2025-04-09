// Write a java program to take a String input and print each upper case alphabet character one by one.
// i/p: AbDDEht
// o/p
// A
// D
// D
// E

import java.util.Scanner;
public class Q2PrintAllUpperCaseOfString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  String: ");
        String s=sc.nextLine();
        int i=0;
        while(i<s.length()){
            char c=s.charAt(i);
            if(c>='A' && c<='Z'){
                System.out.println(c);
            }
            i++;
        }
    }
    
}
