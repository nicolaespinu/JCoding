package codeforces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T_1555ATest {

    @Test
    void testsForGetPizzaMinutes() {

        assertEquals(30, T_1555A.getPizzaMinutes(12));
        assertEquals(40, T_1555A.getPizzaMinutes(15));
        assertEquals(750, T_1555A.getPizzaMinutes(300));
        assertEquals(15, T_1555A.getPizzaMinutes(1));
        assertEquals(25000000000000000L, T_1555A.getPizzaMinutes(9999999999999999L));
        assertEquals(15, T_1555A.getPizzaMinutes(3));
    }
}