package codeforces;

import java.util.Scanner;

public class T_1555A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println(getPizzaMinutes(in.nextLong()));
        }
    }

    public static long getPizzaMinutes(long pieces) {

        if (pieces <= 6) {
            return 15;
        }
        int remainder = (int) (pieces % 6);
        int rest = 0;
        if (remainder == 0) {
            rest = 0;
        } else if (remainder <= 2) {
            rest = 5;
        } else if (remainder <= 4) {
            rest = 10;
        } else {
            rest = 15;
        }

        return pieces / 6 * 15 + rest;
    }
}
