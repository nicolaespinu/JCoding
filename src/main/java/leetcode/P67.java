package leetcode;

import java.math.BigInteger;

/**
 * 67. Add Binary
 * Given two binary strings a and b, return their sum as a binary string.
 */
public class P67 {

    public static String addBinary(String a, String b) {
        return new BigInteger(a, 2).add(new BigInteger(b, 2)).toString(2);
    }
}
