package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfTwoSquaresTest {

    @Test
    void testJudgeSquareSum() {
        assertTrue(SumOfTwoSquares.judgeSquareSum(4));
        assertTrue(SumOfTwoSquares.judgeSquareSum(5));
        assertFalse(SumOfTwoSquares.judgeSquareSum(6));
    }
}