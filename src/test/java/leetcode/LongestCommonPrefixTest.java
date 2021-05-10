package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    void shouldReturnTheLongestCommonPrefix() {
        assertEquals("fl", LongestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        assertEquals("a", LongestCommonPrefix.longestCommonPrefix(new String[]{"ab", "a"}));
        assertEquals("", LongestCommonPrefix.longestCommonPrefix(new String[]{"aflower", "oneflow", "flight"}));
    }
}