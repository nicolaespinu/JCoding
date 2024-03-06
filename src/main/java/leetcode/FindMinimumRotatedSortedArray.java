package leetcode;

public class FindMinimumRotatedSortedArray {

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3, 4, 5, 1, 2}) == 1); //1
        System.out.println(findMin(new int[]{4,5,6,7,0,1,2}) == 0);  //0
        System.out.println(findMin(new int[]{11,13,15,17}) == 11);  //11

    }

    public static int findMin(int[] nums) {
        int start = 0;
        int finish = nums.length-1;
        int mid = start + (finish-start) /2;

//        System.out.println("ST  " + start);
//        System.out.println("FN  " + finish);
//        System.out.println("MID  " + mid);

        if (nums[start] <= mid){

        }
        return 10000;
    }
}
