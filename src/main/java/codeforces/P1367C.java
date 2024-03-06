package codeforces;

import java.util.Scanner;

public class P1367C {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        getNumbOfTables("100010", 1); //1
//        getNumbOfTables("000000", 2); //2
//        getNumbOfTables("100000", 2); //1
//        getNumbOfTables("10101", 1);  //0
//        getNumbOfTables("001", 1);    //1
//        getNumbOfTables("00",2 );     //1
//        getNumbOfTables("0",1 );      //1
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            int len = sc.nextInt();
            int k = sc.nextInt();
            String rest = sc.next();
            getNumbOfTables(k, rest);
        }
    }

    private static void getNumbOfTables(int distance, String restPlaces) {
        final char[] line = ('1' + "0".repeat(distance) + restPlaces + "0".repeat(distance) + '1').toCharArray();
//        System.out.println("LineArray: " + Arrays.toString(line));
        int result = 0;
        int index = 0;
        for (char c : line) {
            if (c == '0') {
                index++;
            } else {
                result += Math.max(0, (index - distance) / (distance + 1));
                index = 0;
            }
        }
        System.out.println(result);
    }
}


/*
  6 1
  100010  // 1
  6 2
  000000  // 2
  5 1
  10101   // 0
  3 1
  001     // 1
  2 2
  00      // 1
  1 1
  0       // 1

  1
  2
  0
  1
  1
  1
 */
