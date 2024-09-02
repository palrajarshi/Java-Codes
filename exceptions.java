public class exceptions {
    public static void main(String[] args) {
        int a = 10;
        try {
            a = a / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();

            System.out.println("Message: " + e.getMessage());
        }
        System.out.println("Hi I am after the exception");
    }
}
