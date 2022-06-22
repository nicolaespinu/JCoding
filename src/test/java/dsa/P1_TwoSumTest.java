package dsa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class P1_TwoSumTest {

    @Test
    void testTwoSum() {
        assertArrayEquals(P1_TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1});
        assertArrayEquals(P1_TwoSum.twoSum(new int[]{3, 2, 4}, 6), new int[]{1, 2});
        assertArrayEquals(P1_TwoSum.twoSum(new int[]{3, 3}, 6), new int[]{0, 1});
    }
}
