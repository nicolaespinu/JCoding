package codewars;

/*
/kata/59e625bf3d09a7471d00020e/train/java
 */
public class T5_5 {
    public static java.util.stream.IntStream stream(int a, int b) {

        return java.util.stream.Stream.iterate(new int[]{a, b}, t -> new int[]{t[1], t[0] + t[1]})
                .map(t -> t[0])
                .mapToInt(integer -> integer.intValue());
    }
}
