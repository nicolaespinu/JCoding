package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test
    void testRemoveElement() {
        assertEquals(2, RemoveElement.removeElement(new int[]{3, 2, 2, 3}, 3));
        assertEquals(5, RemoveElement.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }
}