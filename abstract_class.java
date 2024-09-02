abstract class A {
    void meth1() {
        System.out.println("meth1");
    }

    abstract void meth2();

    abstract void meth3();
}

class B extends A {
    @Override
    void meth2() {
        System.out.println("How is it going I am meth2");
    }

    @Override
    void meth3() {
        System.out.println("How is it going I am meth3");
    }

    void meth4() {

    }
}

public class abstract_class {
    public static void main(String[] args) {
        A obj = new B();
        obj.meth1();
        obj.meth2();
        obj.meth3();
    }
}
