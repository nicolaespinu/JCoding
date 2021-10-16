package leetcode;

public class ClimbingStairs {

    public static int climbStairs(int n) {
        if (n == 1 || n == 2 || n == 3) {
            return n;
        }
        int[] arr = new int[n - 1];
        arr[0] = 2;
        arr[1] = 3;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[arr.length - 1];
    }
}
