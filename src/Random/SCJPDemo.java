package Random;

/**
 * Created by shwetimahajan on 1/30/18.
 */
public class SCJPDemo {
    private static class SomeClass { //Inner-classes can be private but not outer ones. 
        int x = 9;
        public void go() {
            System.out.println("Hello from private class!");
        }
    }

    public static void main(String[] args) {
        SomeClass obj = new SomeClass();
        obj.go();
    }
}
