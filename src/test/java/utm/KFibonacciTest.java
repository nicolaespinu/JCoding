package utm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KFibonacciTest {

    @Test
    void getDigit() {
        assertEquals(2, KFibonacci.getDigit(3));
        assertEquals(3, KFibonacci.getDigit(11));
        assertEquals(8, KFibonacci.getDigit(6));
        assertEquals(3, KFibonacci.getDigit(8));
        assertEquals(2, KFibonacci.getDigit(20));
        assertEquals(5, KFibonacci.getDigit(37));
        assertEquals(8, KFibonacci.getDigit(42));
        assertEquals(7, KFibonacci.getDigit(55));
        assertEquals(5, KFibonacci.getDigit(72));
    }
}

//11235813213455