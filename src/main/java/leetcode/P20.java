package leetcode;

import java.util.Stack;

/**
 * 20. Valid Parentheses
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 */
public class P20 {


    public static boolean isValid(String s) {
        boolean result = false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.empty()) {
                    return false;
                } else {
                    char exChar = stack.pop();
                    if ((exChar == '(' && ch == ')') || (exChar == '[' && ch == ']') || (exChar == '{' && ch == '}')) {
                        continue;
                    } else {
                        return false;
                    }
                }
            }
        }

        return stack.empty();
    }
}
