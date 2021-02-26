package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T6_5Test {

    @Test
    public void sampleTestsForTwosDifference() {
        assertArrayEquals(
                new int[][]{{1, 3}, {2, 4}},
                T6_5.twosDifference(new int[]{1, 2, 3, 4})
        );

        assertArrayEquals(
                new int[][]{{1, 3}, {4, 6}},
                T6_5.twosDifference(new int[]{1, 3, 4, 6})
        );
    }
}