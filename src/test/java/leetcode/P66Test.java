package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class P66Test {

    @Test
    void testPlusOne_IncrementSmallerThanNine() {
        assertArrayEquals(new int[]{1, 2, 4}, P66.plusOne(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{4, 3, 2, 2}, P66.plusOne(new int[]{4, 3, 2, 1}));
        assertArrayEquals(new int[]{1, 2, 3, 8}, P66.plusOne(new int[]{1, 2, 3, 7}));
    }

    @Test
    void testPlusOne_ArrayOneElementEqualsNine() {
        assertArrayEquals(new int[]{1, 0}, P66.plusOne(new int[]{9}));
    }

    @Test
    void testPlusOne_ArrayTwoElementsOneEqualsNine() {
        assertArrayEquals(new int[]{2, 0}, P66.plusOne(new int[]{1, 9}));
        assertArrayEquals(new int[]{6, 0}, P66.plusOne(new int[]{5, 9}));
    }

    @Test
    void testPlusOne_AllArrayElementsEqualsNine() {
        assertArrayEquals(new int[]{1, 0, 0}, P66.plusOne(new int[]{9, 9}));
        assertArrayEquals(new int[]{1, 0, 0, 0, 0}, P66.plusOne(new int[]{9, 9, 9, 9}));
    }

}