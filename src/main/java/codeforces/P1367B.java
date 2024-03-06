package codeforces;

import java.util.Scanner;

public class P1367B {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int n = scanner.nextInt();
//        for (int i = 0; i < n; i++) {
//            int arrLength = scanner.nextInt();
//            int[] arr = new int[arrLength];
//            for (int j = 0; j < arr.length; j++) {
//                arr[j] = scanner.nextInt();
//            }
//            getParityResult(arr);
//        }
        getParityResult(new int[]{3, 2, 7, 6});  //2
        getParityResult(new int[]{3, 2, 6});    // 1
        getParityResult(new int[]{7});           // -1
        getParityResult(new int[]{4, 9, 2, 1, 18, 3, 0});  //0
        getParityResult(new int[]{0, 0});  //-1
        getParityResult(new int[]{1, 1, 1});  //-1
    }

    public static void getParityResult(int[] ints) {
        int result = -1;
        int indexDiff = 0, valueDiff = 0;
        for (int i = 0; i < ints.length; i++) {
            if (i % 2 == 0 && ints[i] % 2 != 0) {
                valueDiff++;
            }
            if (i % 2 != 0 && ints[i] % 2 == 0) {
                indexDiff++;
            }
        }
        if (indexDiff == valueDiff) {
            System.out.println(indexDiff);
        } else {
            System.out.println(result);
        }
    }
}
/**
 * 1
 * 0
 * 1
 * 1
 * 2
 * 0 0=
 * 2
 * 1 0
 * 2
 * 0 1
 * 2
 * 1 1
 * 3
 * 0 0 0
 * 3
 * 1 0 0
 * 3
 * 0 1 0
 * 3
 * 1 1 0
 * 3
 * 0 0 1
 * 3
 * 1 0 1
 * 3
 * 0 1 1
 * 3
 * 1 1 1 ==14
 * 4
 * 0 0 0 0
 * 4
 * 1 0 0 0
 * 4
 * 0 1 0 0
 * 4
 * 1 1 0 0
 * 4
 * 0 0 1 0
 * 4
 * 1 0 1 0
 * 4
 * 0 1 1 0
 * 4
 * 1 1 1 0
 * 4
 * 0 0 0 1
 * 4
 * 1 0 0 1
 * 4
 * 0 1 0 1
 * 4
 * 1 1 0 1
 * 4
 * 0 0 1 1
 * 4
 * 1 0 1 1
 * 4
 * 0 1 1 1
 * 4
 * 1 1 1 1
 * 5
 * 0 0 0 0 0
 * 5
 * 1 0 0 0 0
 * 5
 * 0 1 0 0 0
 * 5
 * 1 1 0 0 0
 * 5
 * 0 0 1 0 0
 * 5
 * 1 0 1 0 0
 * 5
 * 0 1 1 0 0
 * 5
 * 1 1 1 0 0
 * 5
 * 0 0 0 1 0
 * 5
 * 1 0 0 1 0
 * 5
 * 0 1 0 1 0
 * 5
 * 1 1 0 1 0
 * 5
 * 0 0 1 1 0
 */