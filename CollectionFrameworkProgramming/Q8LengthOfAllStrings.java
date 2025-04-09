import java.util.Collection;
import java.util.ArrayList;
public class Q8LengthOfAllStrings {
    public static void main(String[] args) {
        Collection<String> c1=new ArrayList<>();
        c1.add("suraj");
        c1.add("pandey");
        c1.add("rohit");
        for(String x:c1){
             System.out.println(x.length());
        }
    }
    
}
