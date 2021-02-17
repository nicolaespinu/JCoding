package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T5_5Test {

    @Test
    void shouldVerifyIfExistManySemicolons() {
        assertArrayEquals(
                new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34},
                T5_5.stream(0, 1).limit(10).toArray());
    }
}
