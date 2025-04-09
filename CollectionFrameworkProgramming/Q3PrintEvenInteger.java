import java.util.Collection;
import java.util.ArrayList;
public class Q3PrintEvenInteger {
    public static void main(String[] args) {
        Collection<Integer> c1=new ArrayList<>();
        c1.add(11);
        c1.add(3);
        c1.add(54);
        c1.add(23);
        c1.add(13);
        c1.add(32);
        c1.add(49);
        c1.add(22);
        for(Integer x:c1){
            if(x%2==0){
                System.out.println(x+" ");
            }
        }
    }
    
}
