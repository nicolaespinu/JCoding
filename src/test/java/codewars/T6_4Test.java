package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T6_4Test {

    @Test
    void checker() {
        assertEquals("exampleexample", T6_4.removeParentheses("example(unwanted thing)example"));
        assertEquals("example  example", T6_4.removeParentheses("example (unwanted thing) example"));
        assertEquals("a e", T6_4.removeParentheses("a (bc d)e"));
        assertEquals("a", T6_4.removeParentheses("a(b(c))"));
        assertEquals("hello example  something", T6_4.removeParentheses("hello example (words(more words) here) something"));
        assertEquals("  ", T6_4.removeParentheses("(first group) (second group) (third group)"));
    }
}