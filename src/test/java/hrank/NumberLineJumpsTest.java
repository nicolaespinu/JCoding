package hrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberLineJumpsTest {

    @Test
    void shouldReturnYes() {
   assertEquals("YES",NumberLineJumps.kangaroo(0,3,4,2));
    }

    @Test
    void shouldReturnNo() {
        assertEquals("NO",NumberLineJumps.kangaroo(0,2,5,3));
        assertEquals("NO",NumberLineJumps.kangaroo(21, 6, 47, 3));
    }
}
