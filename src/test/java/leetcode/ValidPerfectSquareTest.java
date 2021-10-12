package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPerfectSquareTest {

    @Test
    void isPerfectSquare() {
        assertTrue(ValidPerfectSquare.isPerfectSquare(16));
        assertTrue(ValidPerfectSquare.isPerfectSquare(9));
        assertFalse(ValidPerfectSquare.isPerfectSquare(14));
        assertFalse(ValidPerfectSquare.isPerfectSquare(-4));
    }
}