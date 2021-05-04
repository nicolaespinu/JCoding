package utm;

import java.util.HashSet;
import java.util.Set;

public class InverseCompare {

    public static int reverseSubStrings(String sequence) {
        Set<String> stringSet = new HashSet<>();
        for (int i = 0; i < sequence.length(); i++) {
            for (int j = i + 1; j <= sequence.length(); j++) {
                StringBuilder revSB = new StringBuilder(sequence.substring(i, j)).reverse();
                StringBuilder stringBuilder = new StringBuilder(sequence).replace(i, j, revSB.toString());
                stringSet.add(stringBuilder.toString());
            }
        }
        return stringSet.size();
    }
}
