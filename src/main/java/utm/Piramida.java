package utm;

import java.util.Scanner;

public class Piramida {
    static Scanner scanner = new Scanner(System.in);

    public static int fill(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        int[] tempArr = new int[arr.length - 2];
        for (int i = 0; i < tempArr.length; i++) {
            tempArr[i] = median(arr[i], arr[i + 1], arr[i + 2]);
        }
        return fill(tempArr);
    }

    private static int[] inputData(int n) {

        int[] arr = new int[2 * n - 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    private static int median(int a, int b, int c) {
        int x = a - b;
        int y = b - c;
        int z = a - c;
        if (x * y > 0) return b;
        if (x * z > 0) return c;
        return a;
    }
}
