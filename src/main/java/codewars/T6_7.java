package codewars;

import java.util.*;

/*
kata/5a8d2bf60025e9163c0000bc/train/java
*/
public class T6_7 {

    public static int[] sortByFrequency(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> outputArray = new ArrayList<>();
        for (int current : array) {
            int count = map.getOrDefault(current, 0);
            map.put(current, count + 1);
            outputArray.add(current);
        }
        SortComparator comp = new SortComparator(map);
        Collections.sort(outputArray, comp);

        int[] primitive = outputArray.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return primitive;
    }

    private static class SortComparator implements Comparator<Integer> {
        private final Map<Integer, Integer> freqMap;

        SortComparator(Map<Integer, Integer> tFreqMap) {
            this.freqMap = tFreqMap;
        }

        @Override
        public int compare(Integer o1, Integer o2) {
            int freqCompare = freqMap.get(o2).compareTo(freqMap.get(o1));
            int valueCompare = o1.compareTo(o2);
            if (freqCompare == 0)
                return valueCompare;
            else
                return freqCompare;
        }
    }
}
