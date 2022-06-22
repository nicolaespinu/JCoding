package dsa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class P3_SmallerNumbersThanCurrentTest {

    @Test
    void testSmallerNumbersThanCurrentCaseOne() {
        assertArrayEquals(P3_SmallerNumbersThanCurrent.smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3}), new int[]{4, 0, 1, 1, 3});
    }

    @Test
    void testSmallerNumbersThanCurrentCaseTwo() {
        assertArrayEquals(P3_SmallerNumbersThanCurrent.smallerNumbersThanCurrent(new int[]{6, 5, 4, 8}), new int[]{2, 1, 0, 3});
    }

    @Test
    void testSmallerNumbersThanCurrentCaseThree() {
        assertArrayEquals(P3_SmallerNumbersThanCurrent.smallerNumbersThanCurrent(new int[]{7, 7, 7, 7}), new int[]{0, 0, 0, 0});
    }
}