package codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T_155A {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            integerList.add(in.nextInt());
        }
        System.out.println(getPerformances(integerList));
    }

    public static int getPerformances(List<Integer> aList) {

        int min = aList.get(0);
        int max = min, counter = 0;
        for (int i = 1; i < aList.size(); i++) {
            if (aList.get(i) > max) {
                counter++;
                max = aList.get(i);
            }
            if (aList.get(i) < min) {
                counter++;
                min = aList.get(i);
            }
        }
        return counter;
    }
}
