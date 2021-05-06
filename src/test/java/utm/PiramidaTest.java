package utm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PiramidaTest {

    @Test
    void testFill() {
        assertEquals(4, Piramida.fill(new int[]{1, 2, 3, 4, 8, 9, 11}));
        assertEquals(0, Piramida.fill(new int[]{0}));
        assertEquals(33, Piramida.fill(new int[]{1, 22, 33, 34, 8, 9, 11}));
        assertEquals(1, Piramida.fill(new int[]{1}));
        assertEquals(9, Piramida.fill(new int[]{9, 11, 8}));
        assertEquals(2, Piramida.fill(new int[]{1, 2, 3}));
        assertEquals(4, Piramida.fill(new int[]{1, 6, 7, 4, 3, 5, 2}));
    }
}