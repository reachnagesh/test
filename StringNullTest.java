public class StringNullTest {
    public static void main(String[] args) {
        String str1 = null;
        String str2 = "null";
        
        if (str1 == str2)
            System.out.println("str1 == str2");
        else
            System.out.println("str1 != str2");    
    
    }
}