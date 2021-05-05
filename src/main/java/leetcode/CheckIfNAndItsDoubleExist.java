package leetcode;

public class CheckIfNAndItsDoubleExist {

    public static void main(String[] args) {
//        int[] nums = {5, 10, 6, 7, 12};
        int[] nums = {-2,0,10,-19,4,6,-8};
        System.out.println(checkIfExist(nums));
    }

    public static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == 2 * arr[j] || 2 * arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
