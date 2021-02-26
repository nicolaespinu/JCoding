package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T4_1Test {

    @Test
    void factorial() {

        assertEquals("1", T4_1.Factorial(1));
        assertEquals("120", T4_1.Factorial(5));
        assertEquals("362880", T4_1.Factorial(9));
        assertEquals("1307674368000", T4_1.Factorial(15));
    }
}