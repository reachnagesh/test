import java.util.*;

class StringRecursion {
     void printString(String n) {

     if (n.length() > 1)
     {
		 System.out.print(n.charAt(0)+"*");
		 printString(n.substring(1));
		}
		else
     System.out.print(n.charAt(0));

     }
}

class Recursion {
     public static void main (String args[]) {
         Scanner scan = new Scanner(System.in);
         String inputString = scan.next();

         StringRecursion s = new StringRecursion();

         s.printString(inputString);

     }
}

