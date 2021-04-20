package codewars;
/*
/kata/52945ce49bb38560fe0001d9/train/java
*/
public class T6_8 {
    public static int[][] pascal(int depth) {
        int[][] arrD = new int[depth][];
        for (int i = 0; i < depth; i++) {
            int[] tempArr = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                tempArr[j] = getLine(i, j);
            }
            arrD[i] = tempArr;
        }
        return arrD;
    }

    private static int getLine(int x, int y) {
        int res = 1;
        if (y > x - y)
            y = x - y;
        for (int i = 0; i < y; ++i) {
            res *= (x - i);
            res /= (i + 1);
        }
        return res;
    }
}
