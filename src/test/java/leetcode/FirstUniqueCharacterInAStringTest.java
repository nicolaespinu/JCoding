package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterInAStringTest {

    @Test
    void testFirstUniqChar() {
        assertEquals(0, FirstUniqueCharacterInAString.firstUniqChar("leetcode"));
        assertEquals(2, FirstUniqueCharacterInAString.firstUniqChar("loveleetcode"));
        assertEquals(-1, FirstUniqueCharacterInAString.firstUniqChar("aabb"));
    }
}