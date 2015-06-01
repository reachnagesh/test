import java.util.ArrayList;
import java.util.Collection;

public class RetainAllTest{
	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		ArrayList al2 = new ArrayList();
		
		al1.add(2);
		al1.add(2);
		al1.add(3);
		al2.add(2);
		
		al1.retainAll(al2);
		for (Object obj : al1) {
			System.out.println(obj);
		}
	
	}	
}