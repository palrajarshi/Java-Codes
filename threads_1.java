class A implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            if (i == 200) {
                Thread.yield();
                System.out.println("Back to ready state");
            }
            System.out.printf("Thread 1 in execution! %d\n", i);
        }
    }
}

class B implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            if (i == 250) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                    System.out.println("Sleeping");
                }
            }
            System.out.printf("Thread 2 in execution! %d\n", i);
        }
    }
}

public class threads_1 {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
