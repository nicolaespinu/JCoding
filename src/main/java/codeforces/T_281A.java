package codeforces;

import java.util.Scanner;

/**
 * Capitalization is writing a word with its first letter as a capital letter.
 * Your task is to capitalize the given word.
 * Note, that during capitalization all the letters except the first one remains unchanged.
 * Input
 * A single line contains a non-empty word. This word consists of
 * lowercase and uppercase English letters. The length of the word will not exceed 103.
 * Output the given word after capitalization.
 */
public class T_281A {
    public static void main(String[] args) {
        capitalizeWord(new Scanner(System.in).next());
    }

    private static void capitalizeWord(String next) {
        System.out.println(next.substring(0,1).toUpperCase()+ next.substring(1));
    }
}
