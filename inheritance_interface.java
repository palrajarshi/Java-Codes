interface A {
    void fun();
}

interface B extends A {
    void fun1();
}

class C implements B {
    @Override
    public void fun() {
        System.out.println("Inherited method from interface A");
    }

    @Override
    public void fun1() {
        System.out.println("Implementing method from interface B");
    }
}

public class inheritance_interface {
    public static void main(String[] args) {

    }
}