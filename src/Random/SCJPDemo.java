package Random;

import java.util.StringTokenizer;

/**
 * Created by shwetimahajan on 1/30/18.
 */
public class SCJPDemo {
    public static class SomeClass { //Inner-classes can be private but not outer ones.
        int x = 9;
        public void go() {
            System.out.println("Hello from Some class!");
        }
        public void go1() {
            System.out.println("Inside some class");
        }
        public void go3() {
            System.out.println("go3 in some class");
        }
    }

    public static class AClass extends SomeClass{
        int x = 10;
        public void go() {
            System.out.println("Hello from A class!");
        }
        public void go2() {
            System.out.println("Inside some class");
        }
        public void go3(int x) {
            System.out.println("go3 in a class");
        }
    }


    public static class B {
        public void goat() {
            System.out.println("Hello from goat!");
        }
    }

    public static void main(String[] args) {
        SomeClass obj = new SomeClass();
        SomeClass obj1 = new AClass();
        AClass obj2 = new AClass();
        obj.go();//go in SomeClass
        obj1.go();//In case of overridden methods, polymorphism occurs.
        // So, the overridden method inside AClass is used.
        // Here Object Type determines the method that will be run at runtime.
        obj2.go();//go in AClass
        System.out.println(obj1.x);//No polymorphism occurs, x in SomeClass is accessed.
        obj1.go1();
        //obj1.go2(); Compiler error because the reference variable's type determines which methods can be called.
        //obj1.go3(4); Compiler error because go3(int x) is not inside class SomeClass which is the reference type of variable obj1.
        obj1.go3();
        obj2.go3();
        obj2.go3(4);
        //AClass obj4 = (AClass)(obj); //Throws ClassCastException at Runtime
//        obj4.go();
//        obj4.go3();
        String s = "HEllo";
        if(s instanceof Object) System.out.println(s);
        System.out.println("I am a string"+1+2);
        int i = 0;
        int k = 0;
        int j = 3;
        j+= 3 + (++i);
        System.out.println(j);
        j = 3;
        j += 3 + (k++);
        System.out.println(k);
        System.out.println(j);
        System.out.println(3 + 4 + " ");
        String s2 = "Hello World is here but   other world is here    am another token now!";
        StringTokenizer st = new StringTokenizer(s2, "/t");
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        goose();


    }

    public static void goose() {
        System.out.println("Hello from goose!");
    }
}
