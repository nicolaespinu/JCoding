package hrank;

/*
https://www.hackerrank.com/challenges/kangaroo/problem
 */
public class NumberLineJumps {

    public static String kangaroo(int x1, int v1, int x2, int v2) {

        double result = (double) (x2 - x1) / (v1 - v2);
        if (result > 0 && result % 1 == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
