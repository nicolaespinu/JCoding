package leetcode;

public class MaximumSubarray {
    public static void main(String[] args) {
//        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};  // 6
//        int [] nums = {5,4,-1,7,8};  // 23
//        int [] nums = {1};  // 1
//        int[] nums = {-2, 1};  // 1
    }

    public static int maxSubArray(int[] nums) {
        int result = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                result += nums[j];
                if (result > max) {
                    max = result;
                }
            }
            result = 0;
        }
        return max;
    }
}
