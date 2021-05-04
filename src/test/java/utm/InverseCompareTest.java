package utm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InverseCompareTest {

    @Test
    void testReverseSubStrings() {
        assertEquals(5, InverseCompare.reverseSubStrings("aatt"));
        assertEquals(1, InverseCompare.reverseSubStrings("xxxxxxxx"));
        assertEquals(44, InverseCompare.reverseSubStrings("abracadabra"));
    }
}