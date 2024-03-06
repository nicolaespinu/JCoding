package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class P266B {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int queueSize = sc.nextInt();
        int time = sc.nextInt();
        getModifiedQueue(sc.next(), time);
//        getModifiedQueue("BGGBG", 1); // GBGGB      gBggB
//        getModifiedQueue("BGGBG", 2); // GGBGB
//        getModifiedQueue("GGGB", 1); // GGGB
    }

    private static void getModifiedQueue(String next, int time) {
        String[] arr = next.split("");
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < time; j++) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1].equals("B") && arr[i].equals("G")) {
                    arr[i - 1] = "G";
                    arr[i] = "B";
                    ++i;

                }
            }

        }
        String str = String.join(",", arr);
        System.out.println(str);

    }
}
/**
 * 5 1
 * BGGBG
 * GBGGB
 * ------
 * 5 2
 * BGGBG
 * GGBGB
 * --------
 * 4 1
 * GGGB
 */