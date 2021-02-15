package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T5_2Test {
    @Test
    public void shouldOrderWeight() {
        assertEquals("2000 103 123 4444 99", T5_2.orderWeight("103 123 4444 99 2000"));
        assertEquals("59544965313", T5_2.orderWeight("59544965313"));
        assertEquals("11 11 2000 10003 22 123 1234000 44444444 9999", T5_2.orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
    }

}
