package codeforces;

import java.util.Scanner;

public class P1367A {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            getOriginalWord(scanner.next());
        }
    }

    private static void getOriginalWord(String next) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < next.length(); i += 2) {
            sb.append(next.charAt(i));
        }
        System.out.println(sb.append(next.charAt(next.length()-1)));
    }
}
/**
 * abbaac
 * ac
 * bccddaaf
 * zzzzzzzzzz
 *
 * abac
 * ac
 * bcdaf
 * zzzzzz
 *         getOriginalWord("abbaac");
 *         getOriginalWord("ac");
 *         getOriginalWord("bccddaaf");
 *         getOriginalWord("zzzzzzzzzz");
 */