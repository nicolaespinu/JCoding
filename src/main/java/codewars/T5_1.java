package codewars;

import java.math.BigInteger;

/**
 * /kata/58dff747ca6895f1230000d1/train/java
 */
public class T5_1 {

    public static int returnPrimeBetweenNumbers(int lowestNumber, int highestNumber) {
        BigInteger low = BigInteger.valueOf(lowestNumber);
        BigInteger result = low.nextProbablePrime();
        BigInteger resultFinal = BigInteger.valueOf(-1);
        while (true) {
            if (result.compareTo(BigInteger.valueOf(highestNumber)) < 0) {
                resultFinal = result;
            } else {
                break;
            }
            result = result.nextProbablePrime();
        }
        return resultFinal.intValue();
    }
}
