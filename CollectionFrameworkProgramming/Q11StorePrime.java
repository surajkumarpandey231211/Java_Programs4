import java.util.*;
public class Q11StorePrime {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the range: ");
    int range=sc.nextInt();
    List<Integer> primes=new ArrayList<>();
    int sum=0;
    for(int i=2; i<=range; i++){
        if(isPrime(i)){
            primes.add(i);
            sum=sum+i;
        }
    }
    System.out.println("Prime numbers is: "+primes);
    System.out.println("Size of Prime numbers is: "+primes.size());
    System.out.println("Sum of Prime numbers is: "+sum);

    }
    public static boolean isPrime(int n){
        if(n<2){
            return false; 
        }
        else if(n==2){
            return true;
        }
        else if(n%2==0){
            return false;
        }
        for(int i=3; i<n/2; i +=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
}
