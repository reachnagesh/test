public class StringReplaceTest {
    public static void main(String[] args) {
        System.out.println("string with spaces".replaceAll("[(][0-9][)]|[ ]", ""));
        
        System.out.println("string with 0123 numbers".replaceAll("[(][0-9][)]|[ ]", ""));
        
        System.out.println("string with (parentheses)".replaceAll("[(][0-9][)]|[ ]", ""));

        System.out.println("string with [ parentheses ]".replaceAll("[(][0-9][)]|[ ]", ""));

    }
}