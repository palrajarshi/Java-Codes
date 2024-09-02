class A {
    String name = "rajarshi";
}

class B extends A {

    int age = 18;

    void display() {
        System.out.println(name + " " + age);
    }
}

public class inheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}
