package leetcode;

public class MinCostClimbingStairs {

    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] stairs = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < 2) {
                stairs[i] = cost[i];
            } else {
                stairs[i] = cost[i] + Math.min(stairs[i - 1], stairs[i - 2]);
            }
        }
        return Math.min(stairs[n - 1], stairs[n - 2]);
    }
}
