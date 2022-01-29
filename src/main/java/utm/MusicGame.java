package utm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class MusicGame {
    public static void main(String[] args) {
        Path path1 = Paths.get("file1.txt");
        Path path2 = Paths.get("file2.txt");
        usingBufferedReader(path1.toAbsolutePath().toString());
        System.out.println("==============================");
        usingBufferedReader(path2.toAbsolutePath().toString());
    }

    private static void usingBufferedReader(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            Map<String, Integer> mapOfStrings = new TreeMap<>();
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {

                if (!sCurrentLine.isEmpty() || !sCurrentLine.trim().equals("") || sCurrentLine.trim().equals("\n")) {
                    mapOfStrings.merge(sCurrentLine, 1, Integer::sum);
                }
            }
            List<Integer> integerList = new ArrayList<>(mapOfStrings.values());
            Collections.sort(integerList, Collections.reverseOrder());
            int max = integerList.get(0);
            String maximString = "";
            for (Map.Entry<String, Integer> entry : mapOfStrings.entrySet()) {
                if (entry.getValue() == max && entry.getKey().length() > maximString.length()) {
                    maximString = entry.getKey();
                }
            }
            System.out.println("Number of occurrences: " + max);
            System.out.println("The longest verse is: \n" + maximString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
