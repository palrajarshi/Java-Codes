public class recursion {

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static int sum_Natural_Nums(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sum_Natural_Nums(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(sum_Natural_Nums(5));
    }
}
