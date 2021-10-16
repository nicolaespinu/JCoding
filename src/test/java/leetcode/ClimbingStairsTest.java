package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClimbingStairsTest {

    @Test
    void testClimbStairs() {
        assertEquals(1, ClimbingStairs.climbStairs(1));
        assertEquals(2, ClimbingStairs.climbStairs(2));
        assertEquals(3, ClimbingStairs.climbStairs(3));
        assertEquals(5, ClimbingStairs.climbStairs(4));
        assertEquals(8, ClimbingStairs.climbStairs(5));
        assertEquals(13, ClimbingStairs.climbStairs(6));
        assertEquals(21, ClimbingStairs.climbStairs(7));
        assertEquals(34, ClimbingStairs.climbStairs(8));
        assertEquals(55, ClimbingStairs.climbStairs(9));
        assertEquals(89, ClimbingStairs.climbStairs(10));
    }
}