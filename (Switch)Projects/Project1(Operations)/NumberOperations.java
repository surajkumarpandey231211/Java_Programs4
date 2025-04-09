public class NumberOperations {
    public static int fact(int n1){
        int fact=1; 
        for(int i=1; i<=n1; i++){
            fact=fact*i;
        }
       return fact;
    }
    public static int power(int a,int b){
        int pow=1;
        for(int i=1; i<=b; i++){
            pow=pow*a;
        }
        return pow;
    }
    public static void printTable(int n2){
        for(int i=1; i<=n2; i++){
            for(int j=1; j<=10; j++){
                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println("=====================");
        }
    }
    public static void fibonacciSeries(int num){
        int n1=0;
        int n2=1; 
        int n3=1;
        if(num==0){
            System.out.println(0);
            return;
        }
        System.out.print(n1+" "+n2+" ");
        for(int i=1; i<=num-1; i++){
            n3=n1+n2;
            System.out.println(n3+" ");
            n1=n2;
            n2=n3;
        }
     System.out.println("\nNth fibonacci is: "+n3);   
    }
    public static boolean isPrime(int num){
        if(num<2){
            return false;
        }
        if(num ==2 || num ==3){
            return true;
        }
        if(num%2==0){
            return false;
        }
        for(int i=3; i*i<=num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static int reverseNumber(int num){
        int reverse=0;
        while(num>0){
            int rem=num%10;
            reverse=reverse*10+rem;
         num=num/10;   
        }
        return reverse;
    }

    public static boolean isPalindrome(int num){
        int OrgNum=num;
        int reverse=0;
        while(num>0){
            int rem=num%10;
            reverse=reverse*10+rem;
         num=num/10;   
        }
        return reverse==OrgNum;
    }

    public static int calcArrangement(int n,int r){
        int purmo=1;
        for(int i=0; i<=r; i++){
            purmo=purmo*(n-i);
        }
        return purmo;
    }

    public static int calcSelection(int n,int r){
        int comb=1;
        for(int i=0; i<=r; i++){
            comb=comb*(n-i)/(i+1);
        }
        return comb;
    }

    public static void nthRowOfPascalTrangle(int n){
        for(int i=0; i<=n; i++){
            int comb=1;
            for(int j=0; j<i; j++){
                comb=comb*(n-j)/(j+1);
            }
            System.out.print(comb+" ");
        }
        System.out.println();
    }
}
