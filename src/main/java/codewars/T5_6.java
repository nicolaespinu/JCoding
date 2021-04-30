package codewars;

/*
kata/52685f7382004e774f0001f7
 */
public class T5_6 {

    public static String makeReadable(int sec) {
        int h = sec / 3600;
        int m = (sec % 3600) / 60;
        int s = ((sec % 3600) % 60) % 60;
        String result = (h < 10 ? "0" + h : h) + ":" + (m < 10 ? "0" + m : m) + ":" + (s < 10 ? "0" + s : s);
        return result;
    }
}