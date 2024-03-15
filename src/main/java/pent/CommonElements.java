package pent;

import java.util.*;

public class CommonElements {

//    public static void main(String[] args) {
//
//        List<Integer> firstList = Arrays.asList(3, 2, 1, 4, 5, 6);
//        List<Integer> secondList = Arrays.asList(7, 4, 7, 2, 1, 4, 5, 6);
//        List<Integer> thirdList = Arrays.asList(3, 2, 1, 5, 6);
//
//        List<Integer> returnListByAlg = getSmallestElementsFrom3Lists_Alg(firstList, secondList, thirdList);
//        System.out.println(returnListByAlg);
//
//        List<Integer>  returnListBySet = getSmallestElementsFrom3Lists_Set(firstList, secondList, thirdList);
//
//        System.out.println(returnListBySet);
//        System.out.println(returnListByAlg.equals(returnListBySet));
//    }
//

    public static List<Integer> getSmallestElementsFrom3Lists_Set(List<Integer> firstList, List<Integer> secondList, List<Integer> thirdList) {
        List<Integer> firstResultList = checkForSmallestElementsWithSet(firstList, secondList);
        return checkForSmallestElementsWithSet(firstResultList, thirdList);
    }

    private static List<Integer> checkForSmallestElementsWithSet(List<Integer> firstList, List<Integer> secondList) {

        Set<Integer> firstSet = new HashSet<>(firstList);
        Set<Integer> secondSet = new HashSet<>(secondList);
        firstSet.retainAll(secondSet);

        return new ArrayList<>(firstSet);
    }

    public static List<Integer> getSmallestElementsFrom3Lists_Alg(List<Integer> firstList, List<Integer> secondList, List<Integer> thirdList) {
        List<Integer> aList = checkForSmallestElementsOneIteration(firstList, secondList);

        return checkForSmallestElementsOneIteration(aList, thirdList);
    }

    private static List<Integer> checkForSmallestElementsOneIteration(List<Integer> firstList, List<Integer> secondList) {
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
                i++;
                j++;
            }
        }
        return resultList;
    }
}
