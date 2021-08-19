package codeforces;

import java.util.Scanner;

public class T_148A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(checkDragons(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()));
    }

    public static int checkDragons(int k, int l, int m, int n, int d) {
        int result = 0;
        for (int i = 1; i <= d; i++) {
            if (i % k == 0 || i % l == 0 || i % m == 0 || i % n == 0) {
                result++;
            }
        }
        return result;
    }
}