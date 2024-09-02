public class reverse_arr {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 6, 11, 2 };
        System.out.println("old");
        for (int ele : arr) {
            System.out.printf("%d ", ele);

        }
        System.out.println();
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        for (int ele : arr) {
            System.out.printf("%d ", ele);

        }
        System.out.println();

    }
}
