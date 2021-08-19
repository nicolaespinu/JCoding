package codeforces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class T_141A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(getChecker(in.next(),in.next(), in.next()));
    }

    public static String getChecker(String first, String second, String last) {

        List<String> chars = new ArrayList<>(Arrays.asList((first + second).split("")));
        List<String> lastList = new ArrayList<>(Arrays.asList(last.split("")));

        if (chars.size() != lastList.size()) {
            return "NO";
        }

        String[] strings = last.split("");
        for (int i = 0; i < strings.length; i++) {
            if (chars.contains(strings[i])) {
                chars.remove(strings[i]);
            }
            if (lastList.contains(strings[i])) {
                lastList.remove(strings[i]);
            }
        }

        if (chars.size() == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
