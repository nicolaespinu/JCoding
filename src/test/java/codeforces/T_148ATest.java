package codeforces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T_148ATest {

    @Test
    void checkDragons() {

        assertEquals(0, T_148A.checkDragons(10,9,8,7,6));
        assertEquals(12, T_148A.checkDragons(1,2,3,4,12));
        assertEquals(17, T_148A.checkDragons(2,3,4,5,24));
    }
}