import java.util.Scanner;
public class Q8CkeckPalindromeWithInplaceAlgo {
     public static boolean isPalindrome(String s){
        s=s.toLowerCase();
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start) !=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=sc.nextLine();
        if(isPalindrome(s)){
            System.out.println(s+" is a palindrome ");
        }
        else{
            System.out.println(s+" is NOT a palindrome ");
        }
    }  
}
