package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T6_2Test {

    @Test
    public void checkSmallValues() {
        assertEquals("30", T6_2.numPrimorial(3));
        assertEquals("210", T6_2.numPrimorial(4));
        assertEquals("2310", T6_2.numPrimorial(5));
    }

    @Test
    public void checkLargerValues() {
        assertEquals("9699690", T6_2.numPrimorial(8));
        assertEquals("223092870", T6_2.numPrimorial(9));
    }
}