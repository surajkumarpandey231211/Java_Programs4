// Write a java program to take a String input and print each Lower case alphabet character one by one.
// i/p: AbDDEht
// o/p
// b
// h
// t

import java.util.Scanner;
public class Q3PrintAllLowerCaseCharacter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Steing: ");
        String s=sc.nextLine();
        int i=0;
        while(i<s.length()){
            char c=s.charAt(i);
            if(c>='a' && c<='z'){
                System.out.println(c);
            }
            i++;
        }
    }
    
}
