package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class P1843A {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfTests = sc.nextInt();
        for (int i = 0; i <numberOfTests ; i++) {
            int numberOfElements = sc.nextInt();
            int[] elementsArray = new int[numberOfElements];
            for (int j = 0; j <numberOfElements ; j++) {
                elementsArray[j] = sc.nextInt();
            }
            getMaximumCostOfColoring(elementsArray);
        }
//        getMaximumCostOfColoring(new int[]{1, 5, 6, 3, 4}); // 7
//        getMaximumCostOfColoring(new int[]{1, 9, 6, 3}); // 11
//        getMaximumCostOfColoring(new int[]{1, 13, 9, 3, 7, 2}); // 23
//        getMaximumCostOfColoring(new int[]{4, 4, 4, 4}); // 0
//        getMaximumCostOfColoring(new int[]{4, 5, 2, 2, 3}); // 5
    }

    private static void getMaximumCostOfColoring(int[] elementsArray) {
        Arrays.sort(elementsArray);
        int sum = 0;
        for (int i = 0; i < elementsArray.length / 2; i++) {
            sum = sum + elementsArray[elementsArray.length - 1 - i] - elementsArray[i];
        }
        System.out.println(sum);
    }
}
