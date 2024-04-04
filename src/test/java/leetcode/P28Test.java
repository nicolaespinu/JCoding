package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P28Test {

    @Test
    void testContainingStringOnTheBegin() {
        assertEquals(0, P28.strStr("sadbutsad", "sad"));
    }

    @Test
    void testContainingStringOnTheBeEnd() {
        assertEquals(7, P28.strStr("sradbutsad", "sad"));
    }

    @Test
    void testNotContainingString() {
        assertEquals(-1, P28.strStr("sradbutsad", "sard"));
    }
}