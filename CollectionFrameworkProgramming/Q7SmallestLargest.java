import java.util.Collection;
import java.util.ArrayList;
public class Q7SmallestLargest {
public static void main(String[] args) {
    Collection<Integer> c1=new ArrayList<>();
    c1.add(4);
    c1.add(3);
    c1.add(2);
    c1.add(9);
    System.out.println(c1);
    int largest=Integer.MIN_VALUE;
    int smallest=Integer.MAX_VALUE;
    for(Integer x:c1){
        if(x>largest){
            largest=x;
        }
        if(x<smallest){
            smallest=x;
        }

    }
    System.out.println("Biggest is: "+largest);
    System.out.println("smallest is: "+smallest);
}
    
}
