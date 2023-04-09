class A3 {
    void hello(String s) {
        System.out.println("A3: Hello From " + s);
    }
}

class B3 extends A3 {
    void hello(String s) {
        super.hello(s);
        System.out.println("B3: Hello From " + s);
    }
}

public class main {
    public static void main(String[] args) {
        A3 obj1 = new A3();
        B3 obj2 = new B3();
        A3 obj3 = new B3();

        System.out.println("VEDANT PATEL IU2141230208\n");
        obj1.hello("Object 1");
        obj2.hello("Object 2");
        obj3.hello("Object 3");
    }
}
