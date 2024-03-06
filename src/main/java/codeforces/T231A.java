package codeforces;

import java.util.Scanner;

public class T231A {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        getTeam(scanner.nextInt());
    }

    private static void getTeam(int numberOfProblems) {
        int count = 0;
        int num1, num2,num3;
        for (int i = 0; i < numberOfProblems; i++) {
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            num3 = scanner.nextInt();
            if (num1+num2 ==2 || num2 +num3 ==2 || num3 +num1==2){
                ++count;
            }
        }
        System.out.println(count);
    }
}
