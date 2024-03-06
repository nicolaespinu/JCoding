package codeforces;

import utils.InputClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T_263A {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<List<Integer>> inputIntegers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            List<Integer> integerList = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                integerList.add(scanner.nextInt());
            }
            inputIntegers.add(integerList);
        }
        System.out.println(getNumberOfMoves(inputIntegers));
    }

    private static int getNumberOfMoves(List<List<Integer>> inputList) {
        int count = 0;
        for (int i = 0; i < inputList.size(); i++) {
            for (int j = 0; j < inputList.get(i).size(); j++) {
                if (inputList.get(i).get(j) == 1) {
//                    System.out.println("i: " + i + "  j: " + j);
                    count = Math.abs(i - 2) + Math.abs(j - 2);
                }
            }
        }
        return count;
    }
}
