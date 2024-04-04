package leetcode;

import java.util.Scanner;

/**
 * 28. Find the Index of the First Occurrence in a String
 * Given two strings needle and haystack, return the index of the first
 * occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */
public class P28 {

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
