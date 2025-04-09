import java.util.ArrayList;
import java.util.Collection;
public class Q6SumOfInteger {
    public static void main(String[] args) {
        Collection<Integer> c1=new ArrayList<>();
        c1.add(4);
        c1.add(3);
        c1.add(2);
        c1.add(9);
        System.out.print(c1+" ");
        int sum=0;
        for(Integer x:c1){
            sum=sum+x;
        }
        System.out.println("Sum is: "+sum);
    } 
}
