package codewars;

/*
/kata/5a28cf591f7f7019a80000de/train/java
 */
public class T5_3 {

    public static int missing(String expresion) {
        for (int numOfDigits = 1; numOfDigits <= 6; ++numOfDigits) {

            int tempValue = getValue(expresion, 0, numOfDigits);
            if (tempValue == -1) {
                break;
            }
            int currentMissing = -1;
            boolean flag = false;

            for (int i = numOfDigits; i != expresion.length(); i += 1 + Math.log10(tempValue)) {
                if ((currentMissing == -1)
                        && (getValue(expresion, i, (int) (1 + Math.log10(tempValue + 2))) == tempValue + 2)) {
                    currentMissing = tempValue + 1;
                    tempValue += 2;
                } else if (getValue(expresion, i, (int) (1 + Math.log10(tempValue + 1))) == tempValue + 1) {
                    tempValue++;
                } else {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                return currentMissing;
            }
        }
        return -1;
    }

    private static int getValue(String string, int index, int numLength) {
        if (index + numLength > string.length()) {
            return -1;
        }
        int value = 0;
        for (int j = 0; j < numLength; j++) {
            int c = string.charAt(index + j) - '0';
            if (c < 0 || c > 9) {
                return -1;
            }
            value = value * 10 + c;
        }
        return value;
    }
}
