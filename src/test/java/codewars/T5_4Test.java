package codewars;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T5_4Test {

    private static void testing(long n, String res) {
        assertEquals(res, Arrays.toString(T5_4.smallest(n)));
    }

    @Test
    public void test() {
        testing(261235, "[126235, 2, 0]");
        testing(209917, "[29917, 0, 1]");
        testing(285365, "[238565, 3, 1]");
        testing(269045, "[26945, 3, 0]");
        testing(296837, "[239687, 4, 1]");
    }
}