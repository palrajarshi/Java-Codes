class A extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println("I am thread 1!");
        }
    }
}

class B extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println("I am thread 2!");
        }
    }
}

public class threads {
    public static void main(String[] args) {
        A t1 = new A();
        B t2 = new B();
        t1.start();
        t2.start();
    }
}
