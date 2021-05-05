package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfNAndItsDoubleExistTest {

    @Test
    void shouldCheckIfExist() {
        assertEquals(true, CheckIfNAndItsDoubleExist.checkIfExist(new int[]{5, 10, 6, 7, 12}));
        assertEquals(false, CheckIfNAndItsDoubleExist.checkIfExist(new int[]{-2,0,10,-19,4,6,-8}));
        assertEquals(true, CheckIfNAndItsDoubleExist.checkIfExist(new int[]{0,0}));
        assertEquals(false, CheckIfNAndItsDoubleExist.checkIfExist(new int[]{5, 101, 16, 7, 12}));

    }
}
