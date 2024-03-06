package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputClass {

    public static List<List<Integer>> getMatrix2D() {
        List<Integer> integerList1 = Arrays.asList(0, 0, 0, 0, 0);
        List<Integer> integerList2 = Arrays.asList(0, 0, 0, 0, 0);
        List<Integer> integerList3 = Arrays.asList(0, 1, 0, 0, 0);
        List<Integer> integerList4 = Arrays.asList(0, 0, 0, 0, 0);
        List<Integer> integerList5 = Arrays.asList(0, 0, 0, 0, 0);
        List<List<Integer>> inputList = new ArrayList<>();
        inputList.add(integerList1);
        inputList.add(integerList2);
        inputList.add(integerList3);
        inputList.add(integerList4);
        inputList.add(integerList5);
        return inputList;
    }
}
