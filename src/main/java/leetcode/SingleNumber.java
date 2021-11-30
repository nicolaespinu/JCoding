package leetcode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static int singleNumber(int[] nums) {

        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int n : nums) {
            integerMap.put(n, integerMap.getOrDefault(n, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> m : integerMap.entrySet()) {
            if (m.getValue() == 1) {
                return m.getKey();
            }
        }
        return -100;
    }
}
