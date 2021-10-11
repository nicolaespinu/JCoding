package leetcode;

import java.util.HashSet;

public class SumOfTwoSquares {

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(5));
        System.out.println(judgeSquareSum(6));
        System.out.println(judgeSquareSum(4));
    }
    public static boolean judgeSquareSum(int c) {
        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i <= Math.sqrt(c) ; i++) {
            integers.add(i*i);
            if (integers.contains(c - i*i)){
                return true;
            }
        }
        return false;
    }
}
