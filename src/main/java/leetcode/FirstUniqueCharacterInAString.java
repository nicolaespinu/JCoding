package leetcode;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class FirstUniqueCharacterInAString {

    public static int firstUniqChar(String str) {
        String[] chars = str.split("");
        TreeMap<Integer, String> map = new TreeMap<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            if (!map.containsValue(chars[i]) && !set.contains(chars[i])) {
                map.put(i, chars[i]);
                set.add(chars[i]);
            } else {
                final String fin = chars[i];
                map.entrySet().removeIf(mm -> mm.getValue().equals(fin));
            }
        }
        return map.keySet().stream().findFirst().orElse(-1);
    }
}
