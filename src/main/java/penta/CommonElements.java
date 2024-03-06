package penta;

import java.util.*;

public class CommonElements {

    public static void main(String[] args) {

        List<Integer> firstList = Arrays.asList(3, 2, 1, 4, 5, 6);
        List<Integer> secondList = Arrays.asList(7, 4, 7,  2, 1, 4, 5, 6);
        List<Integer> thirdList = Arrays.asList(3, 2, 1,  5, 6);

        List<Integer> firstReturnList = checkForSmallestElements2(firstList, secondList);
        System.out.println(firstReturnList);

        List<Integer> finalResultList = checkForSmallestElements2(firstReturnList, thirdList);
        System.out.println(finalResultList);
        System.out.println(finalResultList.get(2));
    }

    private static List<Integer> checkForSmallestElements2(List<Integer> firstList, List<Integer> secondList) {

        Set<Integer> firstSet = new HashSet<>(firstList);
        Set<Integer> secondSet =  new HashSet<>(secondList);
        firstSet.retainAll(secondSet);

        return new ArrayList<>(firstSet);

    }

    private static List<Integer> checkForSmallestElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> resultList = new ArrayList<>();

        Collections.sort(firstList);
        Collections.sort(secondList);
        int i = 0, j = 0;
        while (i < firstList.size() && j < secondList.size()) {

            if (firstList.get(i) > secondList.get(j)) {
                j++;
            } else if (firstList.get(i) < secondList.get(j)) {
                i++;
            } else {
                resultList.add(firstList.get(i));
                i++;j++;
            }
        }

        return resultList;
    }
}
