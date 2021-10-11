package leetcode;

public class MaximumSubarray {

    public static int maxSubArray(int[] ints) {
        int maxSumm = ints[0], summ = 0;
        for (int i = 0; i < ints.length; i++) {
            summ = Math.max(summ, 0);
            summ += ints[i];
            maxSumm = Math.max(maxSumm, summ);
        }
        return maxSumm;
    }
}
