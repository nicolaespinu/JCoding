package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T6_6Test {
    @Test
    public void test() {
        assertArrayEquals(new int[]{0}, T6_6.sumParts(new int[]{}));
        assertArrayEquals(new int[]{20, 20, 19, 16, 10, 0}, T6_6.sumParts(new int[]{0, 1, 3, 6, 10}));
        assertArrayEquals(new int[]{21, 20, 18, 15, 11, 6, 0}, T6_6.sumParts(new int[]{1, 2, 3, 4, 5, 6}));
        assertArrayEquals(new int[]{10037855, 9293730, 9292795, 9292388, 9291934, 9291504, 9291414, 9291270, 2581057, 2580168, 2579358, 0}, T6_6.sumParts(new int[]{744125, 935, 407, 454, 430, 90, 144, 6710213, 889, 810, 2579358}));
    }
}
