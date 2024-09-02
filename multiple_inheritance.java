interface A {
    default void fun() {
        System.out.println("Fun method of interface A");
    };
}

interface B {
    default void fun() {
        System.out.println("Fun method of interface B");
    };

}

class C implements A, B {
    @Override
    public void fun() {
        // TODO Auto-generated method stub
        A.super.fun(); // call fun method of interface A
        B.super.fun(); // call fun method of interface B
    }
}

public class multiple_inheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.fun();
    }
}