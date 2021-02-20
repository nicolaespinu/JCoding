package codewars;

import java.math.BigInteger;

/*
/kata/5a99a03e4a6b34bb3c000124/train/java
 */
public class T6_2 {

    public static String numPrimorial(int n) {
        if (n == 1) {
            return "2";
        }
        BigInteger result = new BigInteger("2");
        BigInteger nextPrime = new BigInteger(String.valueOf(result));
        for (int i = 1; i < n; i++) {
            BigInteger index = nextPrime.nextProbablePrime();
            result = result.multiply(index);
            nextPrime = new BigInteger(String.valueOf(index));
        }
        return String.valueOf(result);
    }
}
