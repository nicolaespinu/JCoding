package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P20Test {

    @Test
    void testIsValidOnTrue() {
        assertTrue(P20.isValid("()"));
        assertTrue(P20.isValid("()[]{}"));
    }

    @Test
    void testIsValidOnFalse() {
        assertFalse(P20.isValid("[()"));
        assertFalse(P20.isValid("())[]{}"));

    }
}