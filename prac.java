import java.sql.Array;
import java.util.ArrayList;

public class prac {

    public static void main(String args[]) {

        /* identical pairs */
        // int nums[]= {1,1,1,1};
        // System.out.println(numIdenticalPairs(nums));

        /* Defanging ip */
        // String ip = "1.1.1.1";
        // System.out.println(defangIPaddr(ip));

        /* Shuffle */
        // int[] nums = { 1, 4, 2, 3, 3, 2, 4, 1 };
        // int k = 4;
        // shuffle(nums, k);

        // int[] ans = shuffle(nums, k);

        // for (int i = 0; i < ans.length; i++) {
        // System.out.println(ans[i]);
        // }

        /* diagonalSum */

        // int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // System.out.println(diagonalSum(mat));

        /* numJewelsinStone */

        // String jewels = "aA";
        // String stones = "aAABBBB";

        // int x = numJewelsInStones(jewels, stones);

        // System.out.println(x);

        /* maximum achieveable */
        // System.out.println(theMaximumAchievableX(3, 2));

        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        reverseString(s);
        for (char c : s) {
            System.out.print(c);
        }

    }

    static int numIdenticalPairs(int[] nums) {

        // Problem 1512
        int a = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {

                    a++;
                }
            }
        }

        return a;
    }

    static String defangIPaddr(String address) {
        // problem 1108
        return address.replace(".", "[.]");
    }

    static int[] shuffle(int[] nums, int n) {

        int[] arr = new int[nums.length];
        // int j = n;
        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int k = i; k < nums.length; k = k + n) {
                a.add(nums[k]);

            }
        }

        for (int p = 0; p < a.size(); p++) {
            arr[p] = a.get(p);
        }
        return arr;
    }

    static int diagonalSum(int[][] mat) {

        int ans = 0;
        int mid = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {

                if (mat.length % 2 != 0) {
                    int aa = (int) Math.floor(mat.length / 2);
                    mid = mat[aa][aa];
                    // System.out.println(mid);
                }
                if (i == j) {
                    ans += mat[i][j];
                    // System.out.println(mat[i][j]);
                }

                if (i + j == (mat.length - 1)) {
                    ans += mat[i][j];
                }
            }
        }
        ans -= mid;
        return ans;

    }

    static int numJewelsInStones(String jewels, String stones) {
        int a = 0;

        for (int i = 0; i < jewels.length(); i++) {

            for (int j = 0; j < stones.length(); j++) {

                if (jewels.toCharArray()[i] == stones.toCharArray()[j]) {
                    a++;
                }
            }
        }

        return a;
    }

    static int theMaximumAchievableX(int num, int t) {
        int x = 0;
        int max = num;
        for (int i = 1; i <= t; i++) {
            max = max + i;
            max = max + i;

        }

        return max;
    }

    static void reverseString(char[] s) {
        // StringBuilder stringBuilder = new StringBuilder();
        // stringBuilder.append(s);
        // stringBuilder.reverse();
        // for (int i = 0; i <stringBuilder.length(); i++) {
        // s[i]=stringBuilder.charAt(i);

        // }

        char temp = ' ';
        int i = 0, j = s.length - 1;
        while (i > j) {
            temp = s[j];
            s[j] = s[i];
            s[i] = temp;
            i++;
            j--;

        }

    }

}