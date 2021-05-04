package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    @Test
    void testSearchInsert() {
        assertEquals(4, SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 7));
        assertEquals(2, SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 5));
        assertEquals(1, SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 2));
        assertEquals(4, SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 7));
        assertEquals(0, SearchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 0));
        assertEquals(0, SearchInsertPosition.searchInsert(new int[]{1}, 0));
    }
}