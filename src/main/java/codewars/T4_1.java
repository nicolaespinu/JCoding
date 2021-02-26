package codewars;

import java.math.BigInteger;

public class T4_1 {
    private static BigInteger fact(BigInteger n) {
        if (n.intValue() <= 1) {
            return BigInteger.valueOf(1);
        } else {
            return n.multiply(fact(n.subtract(BigInteger.valueOf(1))));
        }
    }

    public static String Factorial(int n) {
        return fact(BigInteger.valueOf(n)).toString();
    }
}
