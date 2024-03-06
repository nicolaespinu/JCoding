package codeforces;

import java.util.Scanner;

/**
 * There are n stones on the table in a row, each of them can be red, green or blue.
 * Count the minimum number of stones to take from the table so that any two
 * neighboring stones had different colors. Stones in a row are considered neighboring
 * if there are no other stones between them.
 * Input
 * The first line contains integer n (1 ≤ n ≤ 50) — the number of stones on the table.
 * The next line contains string s, which represents the colors of the stones.
 * We'll consider the stones in the row numbered from 1 to n from left to right.
 * Then the i-th character s equals "R", if the i-th stone is red, "G", if it's green and "B", if it's blue.
 * Output
 * Print a single integer — the answer to the problem.
 */
public class T_266A {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        System.out.println(takeStones(scanner.next()));
    }

    private static int takeStones(String input) {
        int result = 0;
        String[] array = input.split("");
        for (int i = 1; i < array.length; i++) {
            if (input.charAt(i - 1) == input.charAt(i)) {
                ++result;
            }
        }
        return result;
    }
}
