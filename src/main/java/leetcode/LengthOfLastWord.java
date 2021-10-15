package leetcode;

public class LengthOfLastWord {

    public static int lengthOfLAstWord(String s) {
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }
}
