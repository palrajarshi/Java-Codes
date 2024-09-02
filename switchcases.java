public class switchcases {
    public static void main(String[] args) {
        int age = 18;

        switch (age) {
            case 17:
                System.out.println("Not matched!");
                break;
            case 19:
                System.out.println("Matched!");
                break;
            default:
                System.out.println("Hii");
        }

        // Enhanced Switch

        String name = "Rajrshi";

        switch (name) {
            case "Harry" -> {
                System.out.println("Harry!");
            }
            case "Rajarshi" -> {
                System.out.println("Rajarshi!");
            }
            default -> {
                System.out.println("Default");
            }
        }
    }
}
