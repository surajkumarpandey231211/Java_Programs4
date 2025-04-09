// Write a java program to take a String input and print and count each digit character one by one.
// i/p: Ab43D6DE83ht
// o/p
// 4
// 3
// 6
// 8
// 3
// Total Digit characters are: 5

import java.util.Scanner;
public class Q4CountDigitCharacer {

    public static int printAndCountDigit(String s) {
        int count=0;
        int i=0;
        while (i<s.length()) {
            char c=s.charAt(i);
            if(c>='0' && c<='9'){
                System.out.println(c);
                count++;
            }
            i++; 
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine();
        System.out.println(printAndCountDigit(s));
    }
    
}
