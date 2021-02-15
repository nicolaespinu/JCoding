package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T5_3Test {

    @Test
    void shouldReturnMissingValue() {
        assertEquals(4, T5_3.missing("123567"));
        assertEquals(92, T5_3.missing("899091939495"));
        assertEquals(100, T5_3.missing("9899101102"));
        assertEquals(-1, T5_3.missing("599600601602"));
        assertEquals(-1, T5_3.missing("8990919395"));
        assertEquals(1002, T5_3.missing("998999100010011003"));
        assertEquals(10000, T5_3.missing("99991000110002"));
        assertEquals(-1, T5_3.missing("979899100101102"));
        assertEquals(900003, T5_3.missing("900001900002900004900005900006"));
    }
}