package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T5_1Test {
    @Test
    public void testPrimeBetweenNumbers() {
        assertEquals(T5_1.returnPrimeBetweenNumbers(8, 16), 13);
        assertEquals(T5_1.returnPrimeBetweenNumbers(4, 8), 7);
        assertEquals(T5_1.returnPrimeBetweenNumbers(2, 4), 3);
        assertEquals(T5_1.returnPrimeBetweenNumbers(7, 14), 13);
        assertEquals(T5_1.returnPrimeBetweenNumbers(17, 19), -1);
        assertEquals(T5_1.returnPrimeBetweenNumbers(6, 12), 11);
        assertEquals(T5_1.returnPrimeBetweenNumbers(35, 78), 73);
        assertEquals(T5_1.returnPrimeBetweenNumbers(30, 37), 31);
        assertEquals(T5_1.returnPrimeBetweenNumbers(14, 22), 19);
        assertEquals(T5_1.returnPrimeBetweenNumbers(40, 71), 67);
        assertEquals(T5_1.returnPrimeBetweenNumbers(28, 62), 61);
        assertEquals(T5_1.returnPrimeBetweenNumbers(22, 33), 31);
        assertEquals(T5_1.returnPrimeBetweenNumbers(45, 62), 61);
        assertEquals(T5_1.returnPrimeBetweenNumbers(21, 25), 23);
        assertEquals(T5_1.returnPrimeBetweenNumbers(32, 46), 43);
        assertEquals(T5_1.returnPrimeBetweenNumbers(24, 71), 67);
        assertEquals(T5_1.returnPrimeBetweenNumbers(16, 21), 19);
        assertEquals(T5_1.returnPrimeBetweenNumbers(23, 44), 43);
        assertEquals(T5_1.returnPrimeBetweenNumbers(9, 35), 31);
        assertEquals(T5_1.returnPrimeBetweenNumbers(25, 47), 43);
        assertEquals(T5_1.returnPrimeBetweenNumbers(37, 81), 79);
        assertEquals(T5_1.returnPrimeBetweenNumbers(14, 52), 47);
        assertEquals(T5_1.returnPrimeBetweenNumbers(24, 34), 31);
        assertEquals(T5_1.returnPrimeBetweenNumbers(0, 24), 23);
        assertEquals(T5_1.returnPrimeBetweenNumbers(20, 42), 41);
        assertEquals(T5_1.returnPrimeBetweenNumbers(7, 49), 47);
        assertEquals(T5_1.returnPrimeBetweenNumbers(44, 57), 53);
        assertEquals(T5_1.returnPrimeBetweenNumbers(9, 17), 13);
        assertEquals(T5_1.returnPrimeBetweenNumbers(46, 52), 47);
        assertEquals(T5_1.returnPrimeBetweenNumbers(45, 68), 67);
        assertEquals(T5_1.returnPrimeBetweenNumbers(37, 69), 67);
    }
}