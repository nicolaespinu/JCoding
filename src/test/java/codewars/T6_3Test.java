package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T6_3Test {

    @Test
    public void shouldCheckMostFrequentDays() {
        assertArrayEquals(new String[]{"Monday"}, T6_3.mostFrequentDays(1770));
        assertArrayEquals(new String[]{"Saturday"}, T6_3.mostFrequentDays(1785));
        assertArrayEquals(new String[]{"Tuesday"}, T6_3.mostFrequentDays(1901));
        assertArrayEquals(new String[]{"Saturday"}, T6_3.mostFrequentDays(2135));
        assertArrayEquals(new String[]{"Sunday"}, T6_3.mostFrequentDays(3043));
        assertArrayEquals(new String[]{"Monday"}, T6_3.mostFrequentDays(2001));
        assertArrayEquals(new String[]{"Sunday"}, T6_3.mostFrequentDays(3150));
        assertArrayEquals(new String[]{"Tuesday"}, T6_3.mostFrequentDays(3230));
        assertArrayEquals(new String[]{"Friday", "Saturday"}, T6_3.mostFrequentDays(2016));
        assertArrayEquals(new String[]{"Wednesday"}, T6_3.mostFrequentDays(1986));
        assertArrayEquals(new String[]{"Thursday"}, T6_3.mostFrequentDays(3361));
        assertArrayEquals(new String[]{"Saturday"}, T6_3.mostFrequentDays(1910));
        assertArrayEquals(new String[]{"Monday", "Tuesday"}, T6_3.mostFrequentDays(1968));
        assertArrayEquals(new String[]{"Wednesday"}, T6_3.mostFrequentDays(1794));
        assertArrayEquals(new String[]{"Monday", "Sunday"}, T6_3.mostFrequentDays(1984));
        assertArrayEquals(new String[]{"Saturday", "Sunday"}, T6_3.mostFrequentDays(2000));
    }
}