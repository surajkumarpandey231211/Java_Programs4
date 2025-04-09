// WAJP to create a collection and print all the integer element of the collection.
import java.util.Collection;
import java.util.ArrayList;
public class Q2PrintInteger {
    public static void main(String[] args) {
        Collection<Object>  c=new ArrayList<>();
        c.add("c");
        c.add(12);
        c.add(21.1);
        c.add(32);
        c.add("raja");
        for(Object x:c){
            if( x instanceof Integer r){
                System.out.println(r);
            }

        }
        
    }
    
}
