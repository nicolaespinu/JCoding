package leetcode;

public class ValidPerfectSquare {

    public static boolean isPerfectSquare(int num) {
        var ss = Math.sqrt(num);
        return ((ss - Math.floor(ss)) == 0);
    }

}
