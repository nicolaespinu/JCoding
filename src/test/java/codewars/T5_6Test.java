package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T5_6Test {
    @Test
    public void shouldReturnTimeHumanReadable() {
        assertEquals("00:00:00", T5_6.makeReadable(0));
        assertEquals("00:00:05", T5_6.makeReadable(5));
        assertEquals("00:01:00", T5_6.makeReadable(60));
        assertEquals("23:59:59", T5_6.makeReadable(86399));
        assertEquals("99:59:59", T5_6.makeReadable(359999));
    }
}