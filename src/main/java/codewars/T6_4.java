package codewars;

/*
/kata/5f7c38eb54307c002a2b8cc8
 */
public class T6_4 {

    public static String removeParentheses(final String expression) {
        StringBuffer buffer = new StringBuffer(expression);
        int count = 0;
        for (int i = 0; i < buffer.length(); i++) {
            if (expression.charAt(i) == '(') {
                count++;
            }
        }
        int indexOpen = 0, indexClosed = 0;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < buffer.length(); j++) {
                if (buffer.charAt(j) == ')') {
                    indexClosed = j;
                    break;
                } else if (buffer.charAt(j) == '(') {
                    indexOpen = j;
                }
            }
            buffer = buffer.delete(indexOpen, indexClosed + 1);
        }
        return buffer.toString();
    }
}
