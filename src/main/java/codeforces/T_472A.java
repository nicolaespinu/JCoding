package codeforces;

import java.util.Scanner;

public class T_472A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        getNumbers(N);
    }

    public static void getNumbers(int n) {

        if (n % 2 == 0) {
            System.out.print(n - 4 + " " + 4);
        } else {
            System.out.print(n - 9 + " " + 9);
        }
    }
}
