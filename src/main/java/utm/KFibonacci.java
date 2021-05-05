package utm;

public class KFibonacci {

    public static int getDigit(int index) {
        int[] arr = new int[1000_000];
        StringBuilder sequence = new StringBuilder("11");
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < 100_000; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            if (sequence.length() <= index) {
                sequence.append(arr[i]);
            }
        }
        return Character.getNumericValue(sequence.charAt(index - 1));
    }
}
