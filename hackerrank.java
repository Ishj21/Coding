import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.stream.Collectors;

public class hackerrank {

    public static void main(String[] args) throws ParseException {

        /* minmaxsum */
        // List<Integer> arr = new ArrayList<>();
        // arr.add(256741038);
        // arr.add(623958417);
        // arr.add(467905213);

        // arr.add(714532089);
        // arr.add(938071625);

        // arr.add(1);
        // arr.add(2);
        // arr.add(3);
        // arr.add(4);
        // arr.add(5);

        // minmaxsum(arr);

        /* timeConversion */
        // String t = "12:01:00PM";
        // String t1 = "12:00:00AM";
        // String tt = timeConversion(t);
        // String tt2 = timeConversion(t1);

        // System.out.println(tt);
        // System.out.println(tt2);

        // int n = 6, k = 3;
        // List<Integer> arr = new ArrayList<>();
        // arr.add(1);
        // arr.add(3);
        // arr.add(2);
        // arr.add(6);
        // arr.add(1);
        // arr.add(2);
        // int x = divisibleSumPairs(n, k, arr);

        // System.out.println(x);

        // List<Integer> arr = new ArrayList<>();
        // arr.add(84);
        // arr.add(29);
        // arr.add(57);
        // arr.add(38);

        // List<Integer> ans = gradingStudents(arr);

        // for (Integer integer : ans) {
        // System.out.println(integer);
        // }

        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        int ar[] = { 34, 95, 34, 64, 45, 95, 16, 80, 80, 75, 3, 25, 75, 25, 31, 3, 64, 16, 31 };
        List<Integer> list = Arrays.stream(ar).boxed().collect(Collectors.toList());
        int x = lonelyinteger(list);

        System.out.println(x);
    }

    static void minmaxsum(List<Integer> arr) {

        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;

        long sum = 0;
        for (Integer integer : arr) {
            sum = sum + integer;

            if (integer < min) {
                min = integer;
            }
            if (integer > max) {
                max = integer;
            }

        }

        System.out.print(sum - max + " ");
        System.out.print(sum - min);

    }

    public static String timeConversion(String s) throws ParseException {
        if (s != null && s != "") {
            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("hh:mm:ssa");
            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

            LocalTime time = LocalTime.parse(s, inputFormatter);

            return time.format(outputFormatter);
        } else
            return "";

    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here

        int size = n;
        int count = 0;
        for (int i = 0; i < ar.size(); i++) {
            for (int j = i + 1; j < ar.size(); j++) {
                if ((ar.get(i) + ar.get(j)) % k == 0) {

                    System.out.println(i + " j " + j);
                    count++;
                }

            }
        }
        System.out.println(count);

        return count;

    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> ans = new ArrayList<>();
        for (Integer num : grades) {
            if (num < 40) {
                ans.add(num);

            } else {

                double x = (Math.ceil((double) num / 5)) * 5;

                if (x - num < 3) {
                    ans.add((int) x);
                } else {
                    ans.add(num);
                }

            }
        }
        return ans;

    }

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        Collections.sort(a);
        int ans = a.get(a.size() - 1);
        System.out.println(a);
        for (int i = 1; i < a.size() - 1; i += 2) {

            if (a.get(i) != a.get(i - 1)) {
                ans = a.get(i - 1);
                break;
            }
        }
        return ans;
    }
}
