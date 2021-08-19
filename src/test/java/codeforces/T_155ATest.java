package codeforces;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T_155ATest {

    @Test
    void testGetPerformances() {
        assertEquals(2, T_155A.getPerformances(List.of(100, 50, 200, 150, 200)));
        assertEquals(4, T_155A.getPerformances(List.of(4664, 6496, 5814, 7010, 5762, 5736, 6944, 4850, 3698, 7242)));
    }
}