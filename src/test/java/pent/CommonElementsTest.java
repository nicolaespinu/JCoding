package pent;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CommonElementsTest {

    List<Integer> firstList = Arrays.asList(3, 2, 1, 4, 5, 6);
    List<Integer> secondList = Arrays.asList(7, 4, 7, 2, 1, 4, 5, 6);
    List<Integer> thirdList = Arrays.asList(3, 2, 1, 5, 6);
    List<Integer> resultList = Arrays.asList(1, 2, 5, 6);

    @Test
    void testGetSmallestElementsFrom3Lists_Set() {
        assertEquals(resultList, CommonElements.getSmallestElementsFrom3Lists_Set(firstList, secondList, thirdList));
    }

    @Test
    void testGetSmallestElementsFrom3Lists_Alg() {
        assertEquals(resultList, CommonElements.getSmallestElementsFrom3Lists_Alg(firstList, secondList, thirdList));
    }

    @Test
    void testListsEquality() {
        assertEquals(
                CommonElements.getSmallestElementsFrom3Lists_Alg(firstList, secondList, thirdList),
                CommonElements.getSmallestElementsFrom3Lists_Set(firstList, secondList, thirdList));
    }
}