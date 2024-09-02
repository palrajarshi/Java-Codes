
class InvalidAgeException extends Exception {
    String name;

    public InvalidAgeException(String name) {
        this.name = name;
    }

    @Override
    public String getMessage() {
        return name;
    }

    @Override
    public String toString() {
        return "Invalid Age Exception";
    }
}

public class exceptions_custom {
    public static void main(String[] args) {
        int age = 17;
        if (age < 18) {
            try {
                throw new InvalidAgeException("ahsfkasv");
            } catch (InvalidAgeException e) {
                System.out.println(e); // prints toString() method
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Hello!");
            }
        } else {
            System.out.println("Hii");
        }

        System.out.println("Exception occured");
    }
}
