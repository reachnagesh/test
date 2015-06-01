import java.util.*;

public class SystemPropsTest {
	public static void main(String[] args) {
		Properties props = System.getProperties();
		Enumeration enumKeys = props.keys();
		while (enumKeys.hasMoreElements()) {
			Object key = enumKeys.nextElement();
			System.out.println(key + " = " + props.get(key));
		
		}
	}
}