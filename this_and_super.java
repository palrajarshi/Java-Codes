class A {
    int a;

    A(int a) {
        this.a = a;
    }

    int set_a() {
        return this.a;
    }
}

class B extends A {
    B(int x) {
        super(x);
    }
}

public class this_and_super {
    public static void main(String[] args) {
        B obj = new B(51);
        System.out.println(obj.set_a());
    }
}
