import java.util.List;
import java.util.ArrayList;

public class StringListToArrayTest {
    public static void main(String[] args) {
    
        String[] a = null;
        List<String> listStr = new ArrayList<>();
        listStr.add("one");
        listStr.add("two");
        a = listStr.toArray(a);
        
        for (String str : a)
            System.out.println(str);
        
        listStr = null;
        a = listStr.toArray(a);
        
        for (String str : a)
            System.out.println(str);
        
    }
}