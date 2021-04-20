package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class T6_8Test {
    @Test
    public void testOne() {
        assertArrayEquals("Depth 1 should return [ [1] ]", new int[][]{{1}}, T6_8.pascal(1));
    }

    @Test
    public void testFive() {
        assertArrayEquals("Depth 5 should return [ [1], [1,1], [1,2,1], [1,3,3,1], [1,4,6,4,1] ]",
                new int[][]{{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}, {1, 4, 6, 4, 1}},
                T6_8.pascal(5));
    }

}