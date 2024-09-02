class A {
    void meth1() {
        System.out.println("Parent class method");
    }
}

class B extends A {
    @Override
    void meth1() {
        System.out.println("child class method");
    }
}

public class method_overriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.meth1();
    }
}
