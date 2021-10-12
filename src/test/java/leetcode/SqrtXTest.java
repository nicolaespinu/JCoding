package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqrtXTest {

    @Test
    void mySqrt() {
        assertEquals(0, SqrtX.mySqrt(0));
        assertEquals(2, SqrtX.mySqrt(8));
        assertEquals(1, SqrtX.mySqrt(2));
        assertEquals(1, SqrtX.mySqrt(1));
        assertEquals(2, SqrtX.mySqrt(4));
        assertEquals(3, SqrtX.mySqrt(9));
        assertEquals(46340, SqrtX.mySqrt(2147395600));
        assertEquals(46339, SqrtX.mySqrt(2147395599));
        assertEquals(46340, SqrtX.mySqrt(2147483647));

    }
}