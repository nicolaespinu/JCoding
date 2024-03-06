package codeforces;

import java.util.Scanner;

public class T_158A {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        getNumOfParticipants(scanner.nextInt(), scanner.nextInt());
        int num = scanner.nextInt();
        int target = scanner.nextInt();
        int arr[] = new int[num];
        for (int j = 0; j < num; j++) {
            arr[j] = scanner.nextInt();
        }
        getNumOfParticipants(target, arr);
//        getNumOfParticipants(5, new int[]{10, 9, 8, 7, 7, 7, 5, 5});
//        getNumOfParticipants(2, new int[]{0, 0, 0, 0});
//        getNumOfParticipants(1, new int[]{1, 1, 1, 1, 1});
    }

    //  8 5 = 10 9 8 7 7 7 5 5  // 6
    //  4 2 = 0 0 0 0           // 0
    //  5 1 = 1 1 1 1 1         // 5
    private static void getNumOfParticipants(int target, int[] arr) {
        int count = 0;
        int next = arr[target - 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= next && arr[i] > 0)
                ++count;
        }
        System.out.println(count);
    }
}
