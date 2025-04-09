import java.util.Collection;
import java.util.ArrayList;
public class Q4OddInteger {
    public static void main(String[] args) {
        Collection<Integer> c1=new ArrayList<>();
        c1.add(21);
        c1.add(32);
        c1.add(39);
        c1.add(1);
        c1.add(13);
        c1.add(91);
        c1.add(39);
        c1.add(16);
        c1.add(33);
        c1.add(9);
        for(Integer x:c1){
            if(x%2==1){
                System.out.print(x+" ");
            }
        }
    }
    
}
