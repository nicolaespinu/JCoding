package pent;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ExtractWordsTest {


    String firstInput = "applebanana";
    List<String> secondInput = Arrays.asList("app", "apple", "orange", "grape", "banana", "watermelon");
    List<String> resultList = Arrays.asList("apple", "banana");


    @Test
    public void testGetIndividualWordsV1() {
        assertEquals(resultList, ExtractWords.getIndividualWordsV1(firstInput, secondInput));
    }

    @Test
    public void testGetIndividualWordsV2() {
        assertEquals(resultList, ExtractWords.getIndividualWordsV2(firstInput, secondInput));
    }
}