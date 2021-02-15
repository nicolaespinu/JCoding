package codewars;

import java.util.*;

/*
/kata/55c6126177c9441a570000cc/train/java
*/
public class T5_2 {

    public static String orderWeight(String expression) {
        if (!expression.contains(" ")) {
            return expression;
        }
        List<String> stringList = Arrays.asList(expression.split(" "));
        List<Integer> integerList = new ArrayList<>();
        Map<Integer, List<String>> map = new TreeMap<>();
        for (String valueMap : stringList) {
            List<String> tempList = null;
            int keyMap = calculateWeightNumber(valueMap);
            integerList.add(keyMap);
            if (map.containsKey(keyMap)) {
                tempList = map.get(keyMap);
                if (tempList == null) {
                    tempList = new ArrayList<>();
                }
                tempList.add(valueMap);

            } else {
                tempList = new ArrayList<>();
                tempList.add(valueMap);
            }
            Collections.sort(tempList);
            map.put(keyMap, tempList);
        }

        String result = "";
        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            for (String text : entry.getValue()
            ) {
                result += text + " ";
            }

        }
        return result.trim();
    }

    private static int calculateWeightNumber(String text) {
        long n = Long.valueOf(text);
        long weight = 0;
        while (n > 0) {
            weight += n % 10;
            n /= 10;
        }
        weight += n;
        return (int) weight;
    }
}
