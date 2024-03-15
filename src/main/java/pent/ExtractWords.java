package pent;

/**
 * Write a program that takes two inputs: a string with two words and no
 * spaces as well as a dictionary of possible words found in the
 * string. You can assume the string has exactly two words in it and no
 * extraneous characters. The dictionary can be a data structure of your
 * choosing. Given these two inputs you need to return a collection
 * containing the two individual words.
 * <p>
 * <p>
 * Example:
 * input #1 - query string: "applebanana" //two words
 * input #2: ["apple", "orange", "grape", "banana", "watermelon"]
 * output: ["apple", "banana"]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExtractWords {
    public static List<String> getIndividualWordsV2(String firstInput, List<String> secondInput) {

        for (int i = 0; i < firstInput.length(); i++) {
            var left = firstInput.substring(0, i);
            var right = firstInput.substring(i);

            if (secondInput.contains(left) && secondInput.contains(right)) {
                return List.of(left, right);
            }
        }
        return List.of();
    }


    public static List<String> getIndividualWordsV1(String firstInput, List<String> inputList) {

        List<String> resultList = new ArrayList<>();
        for (String word : inputList) { // O(n)

            if (firstInput.indexOf(word) > -1) { // O(k) - linear
                resultList.add(word);
            }
        }

        for (int i = 0; i < resultList.size(); i++) {
            for (int j = i + 1; j < resultList.size(); j++) {
                if (i != j && resultList.get(i).length() + resultList.get(j).length() == firstInput.length()) {
                    return Arrays.asList(resultList.get(i), resultList.get(j));
                }
            }
        }
        return new ArrayList<>();
    }
}

