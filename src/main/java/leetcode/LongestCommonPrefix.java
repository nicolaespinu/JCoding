package leetcode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
//        String[] strs = {"flower", "flow", "flight"};
//        String[] strs = {"aflower", "vflow", "flight"};
        String[] strs = {"ab", "a"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        for (int k = 0; k < strs[0].length(); k++) {
            var letter = strs[0].charAt(k);
            for (String text : strs) {
                if (k >= text.length() || text.charAt(k) != letter) {
                    return result.toString();
                }
            }
            result.append(letter);
        }
        return result.toString();
    }
}
