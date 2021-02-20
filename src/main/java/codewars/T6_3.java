package codewars;

import java.time.LocalDate;
import java.util.*;

/*
/kata/56eb16655250549e4b0013f4
 */
public class T6_3 {

    public static String[] mostFrequentDays(int year) {
        List<String> result = new ArrayList<>();
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, year);
        int totalDates = calendar.isLeapYear(year) ? 366 : 365;
        Map<String, Integer> daysMap = new HashMap<>();
        for (int day = 1; day <= totalDates; day++) {
            LocalDate localDateTime = LocalDate.ofYearDay(year, day);
            String dayOfWeek = String.valueOf(localDateTime.getDayOfWeek());
            int count = daysMap.containsKey(dayOfWeek) ? daysMap.get(dayOfWeek) : 0;
            daysMap.put(dayOfWeek, count + 1);
        }
        for (String nameOfDay : daysMap.keySet()
        ) {
            if (daysMap.get(nameOfDay) == 53) {
                result.add(nameOfDay.toUpperCase().substring(0, 1) + nameOfDay.toLowerCase().substring(1));
            }
        }
        String[] arr = new String[result.size()];
        int index = 0;
        while (!result.isEmpty()) {
            if (result.contains("Monday")) {
                arr[index++] = "Monday";
                result.remove("Monday");
            } else if (result.contains("Tuesday")) {
                arr[index++] = "Tuesday";
                result.remove("Tuesday");
            } else if (result.contains("Wednesday")) {
                arr[index++] = "Wednesday";
                result.remove("Wednesday");
            } else if (result.contains("Thursday")) {
                arr[index++] = "Thursday";
                result.remove("Thursday");
            } else if (result.contains("Friday")) {
                arr[index++] = "Friday";
                result.remove("Friday");
            } else if (result.contains("Saturday")) {
                arr[index++] = "Saturday";
                result.remove("Saturday");
            } else if (result.contains("Sunday")) {
                arr[index++] = "Sunday";
                result.remove("Sunday");
            }
        }
        return arr;
    }
}
