package utm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RobotVasileTest {

    @Test
    void verificaHarta() {
        assertEquals("NO", RobotVasile.verificaHarta("LLUUDDRR"));
        assertEquals("YES", RobotVasile.verificaHarta("LLUUUDDRR"));
        assertEquals("YES", RobotVasile.verificaHarta("LLUUUDD"));
    }
}