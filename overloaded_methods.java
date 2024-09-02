class A {
    void meth1(int a) {
        System.out.println(a);
    }

    void meth1() {
        System.out.println("Nothing here");
    }
}

public class overloaded_methods {

    static void meth1() {
        System.out.println("I am Meth1");
    }

    static void meth1(int a) {
        System.out.println(a);
    }

    static void meth1(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        meth1();
        meth1(1);
        meth1(1, 2);

        A obj = new A();
        obj.meth1();
        obj.meth1(274); // Example of overloaded methods
    }
}
