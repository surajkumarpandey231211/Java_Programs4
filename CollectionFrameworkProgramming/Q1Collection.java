// WAJP to create a collection and iterate over the collection.
import java.util.Collection;
import java.util.ArrayList;
public class Q1Collection {
    public static void main(String[] args) {
        Collection<Integer> c1=new ArrayList<>();
        c1.add(21);
        c1.add(22);
        c1.add(1);
        c1.add(2);
        c1.add(10);
        c1.add(2);
        for(Integer x:c1){
            System.out.print(x+" ");
        }
    }

}