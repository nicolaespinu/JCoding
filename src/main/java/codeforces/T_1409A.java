package codeforces;

import java.util.Scanner;

public class T_1409A {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {

            getNumberOfModifications(scanner.nextInt(), scanner.nextInt());
        }

    }

    private static void getNumberOfModifications(int input, int target) {
        int count = 0, coeficient;
        coeficient = input > target ? 1 : -1;
        if (input == target) {
            System.out.println(count);
            return;
        }
        count = input > target ? (input - target) % 10 : (target - input) % 10;

        if (input > target) {
            input = input - count * 10;
        } else {
            target = target - count * 10;
        }
        if (input > target * coeficient) {
            ++count;
        }
        System.out.println(count);
    }
}
