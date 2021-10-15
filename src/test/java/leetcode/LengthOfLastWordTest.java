package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {

    @Test
    void testLengthOfLAstWord() {
        assertEquals(0, LengthOfLastWord.lengthOfLAstWord(""));
        assertEquals(5, LengthOfLastWord.lengthOfLAstWord("Hello World"));
        assertEquals(4, LengthOfLastWord.lengthOfLAstWord("   fly me   to   the moon  "));
        assertEquals(6, LengthOfLastWord.lengthOfLAstWord("luffy is still joyboy"));
        assertEquals(11, LengthOfLastWord.lengthOfLAstWord("Homosapiens"));
    }
}
