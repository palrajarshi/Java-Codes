class A {

    void meth1(String name) {
        System.out.println("Hello!" + name);
    }
}

public class methods {

    static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        A obj = new A();
        obj.meth1("Rajarshi");
    }
}
