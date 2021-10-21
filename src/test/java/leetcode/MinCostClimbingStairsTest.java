package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinCostClimbingStairsTest {

    @Test
    void test_minCostClimbingStairs() {
        assertEquals(15, MinCostClimbingStairs.minCostClimbingStairs(new int[]{10, 15, 20}));
        assertEquals(6, MinCostClimbingStairs.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}
