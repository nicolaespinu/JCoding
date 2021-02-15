package codewars;

/*
kata/573992c724fc289553000e95/train/java
 */
public class T5_4 {
    public static long[] smallest(long n) {
        String result = String.valueOf(n);
        long smallest = n;
        int indexFrom = 0;
        int indexTo = 0;
        for (int from = 0; from < result.length(); from++) {
            char aDigit = result.charAt(from);
            for (int to = 0; to < result.length(); to++) {
                if (from == to) continue;
                StringBuffer buffer = new StringBuffer(result);
                buffer.deleteCharAt(from);
                buffer.insert(to, aDigit);

                long temporalNumber = Long.parseLong(buffer.toString());

                if (temporalNumber < smallest) {
                    smallest = temporalNumber;
                    indexFrom = from;
                    indexTo = to;
                }
            }
        }
        return new long[]{smallest, indexFrom, indexTo};
    }
}
