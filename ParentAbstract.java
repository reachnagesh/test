public abstract class ParentAbstract {
    public void test() {
        System.out.println("Hello!");
    }
    
    public abstract void test2();
}

class TestAbstract {
    public static void main(String[] args) {
        ParentAbstract pa = new ParentAbstract() {
            @Override
            public void test2() {
                System.out.println("Test2");
            }
        };    
    }
}