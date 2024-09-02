public class practice_2 {
    public static void main(String[] args) {
        double income = 34.0;
        double tax = 0;
        if (income < 0) {
            return;
        }

        if (income < 2.5) {
            tax = tax + 0;
        } else if (income > 2.5 && income <= 5.0) {
            tax = tax + (income - 2.5) * 0.05;
        } else if (income > 5.0 && income <= 10.0) {
            tax = tax + 2.5 * 0.05;
            tax = tax + (income - 5.0) * 0.2;
        } else if (income > 10.0) {
            tax = tax + 2.5 * 0.05;
            tax = tax + 5.0 * 0.2;
            tax = tax + (income - 10.0) * 0.3;
        }
        System.out.println(tax);
    }
}
