package codewars;

import java.math.BigInteger;
import java.util.Arrays;

/*
/kata/5a946d9fba1bb5135100007c/train/java
 */
public class T6_1 {

    public static int minimumNumber(int[] numbers) {
        int arraySuma = Arrays.stream(numbers).sum();
        BigInteger integer = new BigInteger(String.valueOf(arraySuma));
        return integer.isProbablePrime(arraySuma) ? 0 : integer.nextProbablePrime().intValue() - arraySuma;
    }
}
