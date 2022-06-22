package dsa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class P2_JewelsInStonesTest {

    @Test
    void testCountJewelsInStones() {
        assertEquals(P2_JewelsInStones.countJewelsInStones("aA", "aAAbbbb"), 3);
        assertEquals(P2_JewelsInStones.countJewelsInStones("z", "ZZ"), 0);
    }
}
