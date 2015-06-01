//http://thecodersbreakfast.net/index.php?category/Java/Quiz
import java.util.Arrays;

public class MatrixTest {
 
    public static void main(String[] args) {
        int[] array = null;
        try {
            array[0] = array[(array = createArray())[array.length - 1]];
        } finally {
            System.out.println("Array = " + Arrays.toString(array));
        }
    }
 
    public static int[] createArray() {
        return new int[]{1, 2, 3, 4};
    }
}

class MatrixTest2 {
    public static void main(String[] args) {
        try {
            Matrix.getTheSpoon();
        } catch (Exception ex) {
            System.out.println(ex instanceof java.lang.NoSuchMethodException ? "You passed the Quiz !" : "You failed !");
        }
    }
}


class Matrix {
    public static void getTheSpoon() throws NoSuchMethodException {
        throw new java.lang.NoSuchMethodException("There is no spoon !");
    }
}