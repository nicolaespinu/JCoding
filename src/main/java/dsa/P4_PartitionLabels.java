package dsa;

import java.util.*;

public class P4_PartitionLabels {

    public static List<Integer> partitionLabels(String s) {
        List<Integer> resultList = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char cc = s.charAt(i);
            map.put(cc, i);
        }

        int max = 0, prev = -1;
        for (int i = 0; i < s.length(); i++) {
            char cc = s.charAt(i);
            max = Math.max(max, map.get(cc));
            if (max == i) {
                resultList.add(max - prev);
                prev = max;
            }
        }
        return resultList;
    }
}
