interface A {
    default void fun() {
        System.out.println("Funnnn!!!");
    }

    void hello(String name);
}

interface B {

    void greetings(String name);
}

class C implements A, B {
    public void hello(String name) {
        System.out.println("hello! " + name);
    }

    public void greetings(String name) {
        System.out.println("Greetings " + name);
    }
}

public class interfaces {
    public static void main(String[] args) {
        C obj = new C();
        obj.fun();
        obj.hello("Raj");
        obj.greetings("Raj");
    }
}
