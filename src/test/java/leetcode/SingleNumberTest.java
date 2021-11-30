package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    @Test
    void testSingleNumber() {
        assertEquals(4, SingleNumber.singleNumber(new int[]{4, 1, 1, 6, 5, 5, 6}));
        assertEquals(2, SingleNumber.singleNumber(new int[]{2, 1, 1, 6, 6}));
        assertEquals(5, SingleNumber.singleNumber(new int[]{5}));
    }
}