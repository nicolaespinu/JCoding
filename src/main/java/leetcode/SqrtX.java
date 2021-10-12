package leetcode;

public class SqrtX {

    public static int mySqrt(int a) {
        long left = 1, right = a;
        while (left <= right) {
            long middle = (left + right) / 2;
            long produs = middle * middle;

            if (produs == a) {
                return (int) middle;
            } else if (produs < a) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return (int) right;
    }
}