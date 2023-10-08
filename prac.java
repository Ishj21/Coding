import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        /* reverseString */
        // char[] s = { 'h', 'e', 'l', 'l', 'o' };
        // reverseString(s);
        // for (char c : s) {
        // System.out.print(c);
        // }

        /* running sum of 1D array */
        // int[] nums = { 1, 2, 3, 4 };
        // int[] ans = runningSum(nums);

        // for (int i : ans) {
        // System.out.println(i);
        // }

        /* Richest Customer Wealth */
        // int[][] a = { { 1, 2, 3 }, { 3, 2, 1 } };
        // int ans = maximumWealth(a);
        // System.out.println(ans);

        /* Fizz Buzz */
        // int n = 15;
        // List<String> a = fizzBuzz(n);
        // for (String string : a) {
        // System.out.println(string);
        // }

        /* Number of steps to Zero */
        // int a = 14;
        // int ans = numberOfSteps(a);
        // System.out.println(ans);

        /* middle of linked list */

        ListNode node0 = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode ans = middleNode(node0);
        while (ans != null) {
            // System.out.println(ans.val);
            ans = ans.next;
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

    static int[] runningSum(int[] nums) {
        int[] a = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            a[i] = sum;
        }

        return a;
    }

    static int maximumWealth(int[][] accounts) {

        int max = 0;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                sum = sum + accounts[i][j];
                max = Math.max(max, sum);
            }
        }

        return max;
    }

    static List<String> fizzBuzz(int n) {
        List<String> a = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                a.add("FizzBuzz");

            } else if (i % 3 == 0) {
                a.add("Fizz");
            } else if (i % 5 == 0) {
                a.add("Buzz");
            } else
                a.add(i + "");

        }

        return a;

    }

    static int numberOfSteps(int num) {
        int ans = 0;
        int count = 0;
        int n = num;
        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
                count++;
            } else {
                n = n - 1;
                count++;
            }

        }

        return count;
    }

    static ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}