package hrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {

    @Test
    void testGetFraction() {
        assertEquals("0.5", Fraction.getFraction(1,2));
        assertEquals("2.0", Fraction.getFraction(2,1));
        assertEquals("0.(6)", Fraction.getFraction(2,3));
        assertEquals("0.(3)", Fraction.getFraction(1,3));
        assertEquals("3.(3)", Fraction.getFraction(10,3));
    }
}
