package codewars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
/kata/5ce399e0047a45001c853c2b/train/java.
*/
public class T6_6 {
    public static int[] sumParts(int[] ls) {
        List<Integer> aList = Arrays.stream(ls).boxed().collect(Collectors.toList());
        int[] arr = new int[ls.length + 1];
        int suma = 0;
        suma = aList.stream().reduce(0, Integer::sum);
        arr[0] = suma;
        for (int i = 1; i < ls.length; i++) {
            suma = suma - ls[i - 1];
            arr[i] = suma;
        }
        return arr;
    }
}
