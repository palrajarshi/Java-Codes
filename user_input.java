import java.util.Scanner;

public class user_input { // main class name should be the same as the file name

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str_input = sc.nextLine();
        System.out.println(str_input);

        sc.close();
    }
}
