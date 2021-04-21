package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseIntegerTest {
    @Test
    public void test() {
        assertEquals(321, ReverseInteger.reverse(123));
        assertEquals(-321, ReverseInteger.reverse(-123));
        assertEquals(21, ReverseInteger.reverse(120));
        assertEquals(0, ReverseInteger.reverse(0));
        assertEquals(2, ReverseInteger.reverse(2));
        assertEquals(0, ReverseInteger.reverse(1534236469));
    }
}