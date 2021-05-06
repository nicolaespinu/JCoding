package utm;

public class RobotVasile {

    public static String verificaHarta(String harta) {
        String result = "";
        int x = 0;
        int y = 0;

        for (int i = 0; i < harta.length(); i++) {
            if (harta.charAt(i) == 'U') {
                y++;
            } else if (harta.charAt(i) == 'D') {
                y--;
            } else if (harta.charAt(i) == 'R') {
                x++;
            } else {
                x--;
            }
        }
        if (x == 0 && y == 0) {
            result = "NO";
        } else {
            result = "YES";
        }
        return result;
    }
}
