package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciNumberTest {

    @Test
    void testFibMethod() {
        assertEquals(0, FibonacciNumber.fib(0));
        assertEquals(1, FibonacciNumber.fib(1));
        assertEquals(1, FibonacciNumber.fib(2));
        assertEquals(55, FibonacciNumber.fib(10));
        assertEquals(610, FibonacciNumber.fib(15));
    }
}