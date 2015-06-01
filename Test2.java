public class Test2 {
    protected String str = "Super class String";
    
    protected void printStr() {
        System.out.println(str);    
    }

    public static void main(String[] str) {
	int i = 0;
	byte b = 0;
	short s = 0;
	s = b;
	char c = 'a';
	c = s;
	
        Test2 test2 = new SubTest();
        test2.printStr();
    }

}

class SubTest extends Test2 {
    protected String str = "Sub class String"; 
    
}
