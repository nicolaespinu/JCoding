package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T6_5 {

    public static int[][] twosDifference(int[] array) {
        Arrays.sort(array);
        List<int[]> listArrays = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (Math.abs(array[i] - array[j]) == 2) {
                    listArrays.add(new int[]{array[i], array[j]});
                }
            }
        }
        int i = 0;
        int[][] result = new int[listArrays.size()][];

        for (int[] arr : listArrays) {
            result[i++] = arr;
        }
        return result;
    }
}
