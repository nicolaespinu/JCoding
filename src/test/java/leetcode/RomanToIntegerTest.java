package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntegerTest {

    @Test
    void testRomanToInt() {
        assertEquals(1, RomanToInteger.romanToInt("I"));
        assertEquals(3, RomanToInteger.romanToInt("III"));
        assertEquals(4, RomanToInteger.romanToInt("IV"));
        assertEquals(5, RomanToInteger.romanToInt("V"));
        assertEquals(10, RomanToInteger.romanToInt("X"));
        assertEquals(11, RomanToInteger.romanToInt("XI"));
        assertEquals(24, RomanToInteger.romanToInt("XXIV"));
        assertEquals(58, RomanToInteger.romanToInt("LVIII"));
        assertEquals(1996, RomanToInteger.romanToInt("MCMXCVI"));
    }
}
