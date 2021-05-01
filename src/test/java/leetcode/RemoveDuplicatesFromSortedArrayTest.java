package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    void testRemoveDuplicates() {

        assertEquals(2,RemoveDuplicatesFromSortedArray.removeDuplicates(new int[]{1, 1, 2}));
        assertEquals(0,RemoveDuplicatesFromSortedArray.removeDuplicates(new int[]{}));
        assertEquals(5,RemoveDuplicatesFromSortedArray.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }
}