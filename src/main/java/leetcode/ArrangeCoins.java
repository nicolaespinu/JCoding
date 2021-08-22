package leetcode;

public class ArrangeCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(8));
        System.out.println(arrangeCoins(5));
        System.out.println(arrangeCoins(
                1804289383));
    }

    public static int arrangeCoins(int n) {

        int result = (int) Math.floor(Math.sqrt(2.0 * n));
        if (result * (result + 1L) > 2.0 * n) {
            result--;
        }
        return result;
    }
}
