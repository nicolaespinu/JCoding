package dsa;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class P4_PartitionLabelsTest {

    @Test
    void testPartitionLabelsFirst() {
        assertEquals(P4_PartitionLabels.partitionLabels("ababcbacadefegdehijhklij"), Arrays.asList(9, 7, 8));
    }

    @Test
    void testPartitionLabelsSecond() {
        assertEquals(P4_PartitionLabels.partitionLabels("eccbbbbdec"), Arrays.asList(10));
    }
}