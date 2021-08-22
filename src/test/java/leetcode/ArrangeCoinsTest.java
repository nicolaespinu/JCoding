package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrangeCoinsTest {

    @Test
    void arrangeCoins() {
        assertEquals(2,ArrangeCoins.arrangeCoins(5));
        assertEquals(3,ArrangeCoins.arrangeCoins(8));
        assertEquals(60070,ArrangeCoins.arrangeCoins(1804289383));
    }
}