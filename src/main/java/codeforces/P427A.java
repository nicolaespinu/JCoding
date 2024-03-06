package codeforces;

import java.util.Scanner;

public class P427A {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int numbOfTests = in.nextInt();
        int[] arr = new int[numbOfTests];
        for (int i = 0; i < numbOfTests; i++) {
            arr[i] = in.nextInt();
        }
        getUntreatedCrimes(arr);
//        getUntreatedCrimes(new int[]{-1, -1, 1}); //2
//        getUntreatedCrimes(new int[]{1, -1, 1, -1, -1, 1, 1, 1});  //1
//        getUntreatedCrimes(new int[]{-1, -1, 2, -1, -1, -1, -1, -1, -1, -1, -1});  //8
    }

    private static void getUntreatedCrimes(int[] ints) {
        int numOfCops = 0, untreatedCrimes = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < 0 && numOfCops == 0) {
                ++untreatedCrimes;
            } else if (ints[i] < 0 && numOfCops > 0) {
                --numOfCops;
            } else if (ints[i] > 0) {
                numOfCops += ints[i];
            }
        }
        System.out.println(untreatedCrimes);
    }
}
/**
 * 3
 * -1 -1 1
 * 2
 * <p>
 * <p>
 * 8
 * 1 -1 1 -1 -1 1 1 1
 * 1
 */