import java.util.ArrayList;
import java.util.List;

public class hackerrank {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        // arr.add(256741038);
        // arr.add(623958417);
        // arr.add(467905213);

        // arr.add(714532089);
        // arr.add(938071625);

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        minmaxsum(arr);

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
}
