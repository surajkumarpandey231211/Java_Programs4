import java.util.Collection;
import java.util.ArrayList;
public class Q5PrintThreeDigitInteger {
    public static void main(String[] args) {
        Collection<Integer> c1=new ArrayList<>();
        c1.add(211);
        c1.add(32);
        c1.add(39);
        c1.add(111);
        c1.add(843);
        c1.add(321);
        c1.add(39);
        c1.add(176);
        c1.add(33);
        c1.add(9);
        int count=0;
        for(Integer x:c1){
            if( x>=100 && x<=999){
                count++;
            }
        }
        System.out.println("Count of three digit number is: "+count);
    }
    
}
