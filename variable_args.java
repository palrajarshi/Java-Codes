class A {
    int sum(int a, int... arr) {
        int sum = 0;
        System.out.println(a);
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}

public class variable_args {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.sum(1, 2, 3));
    }
}
