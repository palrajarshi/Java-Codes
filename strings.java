public class strings {
    public static void main(String[] args) {
        String str = new String("Rajarshi Pal");

        System.out.println(str.substring(1));
        System.out.println(str.substring(1, 5));

        System.out.println(str.replace("Pal", "Harry"));

        String str1 = "Sachin Tendulkar";
        System.out.println(str1.replace("Tendulkar", "Kohli"));

        String str2 = "Harry Bhai";

        System.out.println(str2.endsWith(" Bhaii"));
        System.out.println(str.lastIndexOf("aj"));
    }
}
