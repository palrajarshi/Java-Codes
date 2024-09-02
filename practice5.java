public class practice5 {
    static int fibo(int n) {
        if (n == 0 || n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    static void pattern(int n) {

        if (n == 0) {
            return;
        }
        pattern(n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println(fibo(6));
        pattern(4);
    }
}
