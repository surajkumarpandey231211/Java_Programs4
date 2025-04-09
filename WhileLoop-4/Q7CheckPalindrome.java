// heck whether the given String is a palindrome String or NOT by Reversing and comparing.
// i/p :
// MADAM
// O/p:
// It is a Palindrome String.

import java.util.Scanner;
public class Q7CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s1=sc.nextLine();
        s1=s1.toLowerCase();
        int i=s1.length()-1;
        String str="";
        while (i>=0) {
           str=str+s1.charAt(i);
          i--;  
        }
        if(s1.equals(str)){
            System.out.println(s1+" is a palindrome ");
        }
        else{
            System.out.println(s1+" is not a palindrome ");
        }
        
    }
    
}
