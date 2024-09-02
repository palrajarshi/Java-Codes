public class multidimensional_arrays {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];

        arr[0][0] = 1;
        arr[0][1] = 11;
        arr[0][2] = 45;
        arr[1][0] = 3;
        arr[1][1] = 2;
        arr[1][2] = 1;

        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

    }
}
