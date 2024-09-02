public class arrays {
    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;
        arr[4] = 1;

        for (int ele : arr) {
            System.out.println(ele);
        }

        // declaration 2:

        int[] arr2 = { 1, 2, 4, 5, 7 };

        for (int i : arr2) {
            System.out.println(i);
        }
    }
}
