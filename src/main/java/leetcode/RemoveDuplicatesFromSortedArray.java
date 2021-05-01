package leetcode;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[k] != nums[i]) {
                nums[++k] = nums[i];
            }
        }
        for (int i = 0; i <= k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        return k + 1;
    }
}
