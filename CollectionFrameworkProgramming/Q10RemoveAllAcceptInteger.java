import java.util.*;

public class Q10RemoveAllAcceptInteger {
    public static void main(String[] args) {
        ArrayList<Object> c1=new ArrayList<>();
        c1.add(12);
        c1.add("ane");
        c1.add("rwe");
        c1.add(21.1);
        c1.add(12);
        c1.add("ande");
        c1.add("rSR");
        c1.add(22.1);
        for(int i=0; i<c1.size(); i++){
            if(!(c1.get(i) instanceof Integer )){
                c1.remove(i--);
            }
        }
        System.out.println(c1);
    }
    
}
