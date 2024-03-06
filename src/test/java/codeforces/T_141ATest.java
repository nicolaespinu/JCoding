package codeforces;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class T_141ATest {

    @Test
    void testCheckLetters() {

        assertEquals("YES", T_141A.getChecker("SANTACLAUS", "DEDMOROZ", "SANTAMOROZDEDCLAUS"));
        assertEquals("NO", T_141A.getChecker("PAPAINOEL", "JOULUPUKKI", "JOULNAPAOILELUPUKKI"));
        assertEquals("NO", T_141A.getChecker("BABBONATALE", "FATHERCHRISTMAS", "BABCHRISTMASBONATALLEFATHER"));
    }
}