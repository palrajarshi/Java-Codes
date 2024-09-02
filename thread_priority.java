class A implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {

            System.out.println("Thread 1 is running");
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getPriority());
            try {
                if (i == 200) {
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
            }
            System.out.println(Thread.currentThread().getState());

        }
    }
}

class B implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {

            System.out.println("Thread 2 is running");
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getPriority());
            System.out.println(Thread.currentThread().getState());
        }
    }
}

public class thread_priority {
    public static void main(String[] args) {
        A obj = new A();
        B obj2 = new B();
        Thread t1 = new Thread(obj, "Rajarshi");
        Thread t2 = new Thread(obj2, "Ram");
        // t2.setPriority(Thread.MAX_PRIORITY);
        // t1.setPriority(Thread.MIN_PRIORITY);
        t2.start();
        /*
         * try {
         * t2.join();
         * } catch (InterruptedException e) {
         * System.out.println("sgfug");
         * }
         */
        t1.start();
    }
}
