import java.util.*;

public class MemoryHog {
	private static List<Long> longList = new ArrayList<Long>();
	
	public static void main(String[] args) {
	    int i = 0;
		while (true) {
			if (i % 1000 == 0)
				longList.add(System.currentTimeMillis());	
			i++;
		}
	}
}