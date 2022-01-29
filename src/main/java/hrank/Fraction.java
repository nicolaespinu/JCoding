package hrank;

import java.util.HashMap;
import java.util.Map;

public class Fraction {

    public static String getFraction(int a, int b) {

        if (a == 0) return "0";
        if (b == 0) return "";

        StringBuilder builder = new StringBuilder();
        if ((a < 0) ^ (b < 0)) builder.append("-");

        a = Math.abs(a);
        b = Math.abs(b);

        long intreg = a / b;
        long rest = a % b * 10L;

        builder.append(intreg);
        if (rest == 0) return builder.append(".0").toString();

        builder.append(".");
        Map<Long, Integer> map = new HashMap<>();

        while (rest != 0) {
            if (map.containsKey(rest)) {
                int index = map.get(rest);
                String first = builder.substring(0, index);
                String second = "(" + builder.substring(index, builder.length()) + ")";
                return first + second;
            }
            map.put(rest, builder.length());
            intreg = rest / b;
            builder.append(intreg);

            rest = (rest % b) * 10;
        }
        return builder.toString();
    }
}
