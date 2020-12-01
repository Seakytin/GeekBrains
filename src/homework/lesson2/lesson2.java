package homework.lesson2;

public class lesson2 {
    public static void main(String[] args) {
           invertArray();
            fillArray();
            changeArray();
            fillDiagonal();
            fillDiagonal1();
            minAndMax();

    }

    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
            {
                System.out.println(arr[i]);
            }
        }
    }

    public static void fillArray() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
            System.out.println(arr[i]);
        }
    }

    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.println(arr[i]);
        }

    }

    public static void fillDiagonal() {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 1;

                }
                System.out.println(arr[i][j]);
            }
        }
    }

    public static void fillDiagonal1() {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i + j) == (arr.length - 1)) {
                    arr[i][j] = 1;

                }
                System.out.println(arr[i][j]);
            }
        }
    }

    public static void minAndMax() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, -2, 4, 8, 9, 1};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

}



