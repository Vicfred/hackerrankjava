import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import java.time.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static String findDay(int month, int day, int year) {
        Calendar calendar = new GregorianCalendar(year,month-1,day-1);
        return DayOfWeek.of(calendar.get(Calendar.DAY_OF_WEEK)).toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year, month, day;
        month = scanner.nextInt();
        day = scanner.nextInt();
        year = scanner.nextInt();
        String res = findDay(month, day, year);
        System.out.println(res);
    }
}

