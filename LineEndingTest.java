import java.io.*;

public class LineEndingTest {
	public static void main(String[] args) throws Exception {
		String line = "";
		BufferedReader br = new BufferedReader(new FileReader("C:\\java-files\\test.txt"));
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
	
	
	
	}
}