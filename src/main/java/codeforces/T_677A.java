package codeforces;

import java.util.Scanner;

public class T_677A {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int numberOfPersons = scanner.nextInt();
        int h = scanner.nextInt();

        System.out.println(getResult(numberOfPersons, h));
    }

    private static int getResult(int numberOfPersons, int high) {
        int count = 0;
        int person = 0;
        for (int i = 0; i < numberOfPersons; i++) {
            person = scanner.nextInt();
            if (person > high) {
                count += 2;
            } else {
                ++count;
            }
        }
        return count;
    }
}
