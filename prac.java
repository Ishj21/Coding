import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

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

        // ListNode node0 = new ListNode(1);
        // ListNode node1 = new ListNode(2);
        // ListNode node2 = new ListNode(3);
        // ListNode node3 = new ListNode(4);
        // ListNode node4 = new ListNode(5);
        // ListNode node5 = new ListNode(6);

        // node0.next = node1;
        // node1.next = node2;
        // node2.next = node3;
        // node3.next = node4;
        // node4.next = node5;

        // ListNode ans = middleNode(node0);
        // while (ans != null) {
        // // System.out.println(ans.val);
        // ans = ans.next;
        // }

        /* Construct wala ques */
        // String ransom = "aa";
        // String magazine = "aab";
        // System.out.println(canConstruct(ransom, magazine));

        /* Max Consecutive ones */
        // int[] arr = { 1, 0, 1, 1, 0, 1 };
        // int ans = findMaxConsecutiveOnes(arr);
        // System.out.println(ans);

        /* Find number with even digits */
        // int[] arr = { 555, 901, 482, 1771 };
        // int ans = findNumbers(arr);
        // System.out.println(ans);

        /* Square of sorted array */
        // int[] arr = { -4, -1, 0, 3, 10 };
        // int[] ans = sortedSquares(arr);

        // for (int i = 0; i < ans.length; i++) {
        // // System.out.println(arr[i]);
        // }

        /* Duplicate Zeros */

        // int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
        // duplicateZeros(arr);

        /* minProcessingTime */
        // processorTime = [8,10], tasks = [2,2,3,1,8,7,4,5]

        // List<Integer> pt = new ArrayList<>();
        // pt.add(33);
        // pt.add(320);
        // List<Integer> tasks = new ArrayList<>();
        // tasks.add(132);
        // tasks.add(68);
        // tasks.add(232);
        // tasks.add(166);
        // tasks.add(30);
        // tasks.add(300);
        // tasks.add(112);
        // tasks.add(138);

        // int a = minProcessingTime(pt, tasks);
        // System.out.println(a);

        /* SparseArray */

        // int nums1[] = { 0 };
        // int m = 0;
        // int[] nums2 = { 1 };
        // int n = 1;
        // int nums1[] = { 1 };
        // int m = 1;
        // int[] nums2 = {};
        // int n = 0;
        // int nums1[] = { 1, 2, 3, 0, 0, 0 };
        // int m = 3;
        // int[] nums2 = { 2, 5, 6 };
        // int n = 3;

        // merge(nums1, m, nums2, n);

        /* removeElement */
        // int[] nums = { 3, 2, 2, 3 };
        // int val = 3;

        // System.out.println(removeElement(nums, val));

        /* Remove duplicates from array */

        // int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        // int[] nums = { 1, 1, 2 };
        // System.out.println(removeDuplicates(nums));

        /* 2873. Maximum Value of an Ordered Triplet I */
        // int nums[] = { 1, 2, 3 };
        // System.out.println(maximumTripletValue(nums));

        /* Check If N and Its Double Exist */
        // int[] arr = { -2, 0, 10, -19, 4, 6, -8 };
        // boolean ya = checkIfExist(arr);
        // System.out.println(ya);

        /* Smallest even multiple */
        // // int ans = smallestEvenMultiple(5);
        // // System.out.println(ans);

        /* parking system */
        // ParkingSystem p = new ParkingSystem(1, 1, 0);
        // boolean a = p.addCar(1);
        // System.out.println(a);

        /* Strictly palindromic number */
        // int n = 5;
        // boolean isStrictlyPalindromic = isStrictlyPalindromic(n);
        // System.out.println(isStrictlyPalindromic);
        // // System.out.println(isPalandrome("1001"));

        /* MaxCandies */
        // int[] arr = { 12, 1, 12 };
        // List<Boolean> ans = kidsWithCandies(arr, 10);
        // for (Boolean boolean1 : ans) {
        // System.out.println(boolean1);
        // }

        // int[] ans = { 8, 1, 2, 2, 3 };
        // int[] anss = smallerNumbersThanCurrent(ans);
        // System.out.println(Arrays.toString(anss));

        // /* count pairs */

        // List<Integer> ans = new ArrayList<>();
        // ans.add(-6);
        // ans.add(2);
        // ans.add(5);
        // ans.add(-2);
        // ans.add(-7);
        // ans.add(-1);
        // ans.add(3);
        // int anss = countPairs(ans, -2);
        // System.out.println(anss);

        /* most words count */
        String[] arr = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };

        int ans = mostWordsFound(arr);
        System.out.println(ans);
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

    static boolean canConstruct(String ransomNote, String magazine) {

        // wrong ans
        // TODO: Will do when hashmap
        boolean ans = false;

        char[] a = ransomNote.toCharArray();
        char[] b = magazine.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        String rn = new String(a);
        String mz = new String(b);

        if (mz.contains(rn)) {
            ans = true;
        }
        System.out.println(ans);
        return ans;
    }

    static int findMaxConsecutiveOnes(int[] nums) {

        int max = 0;
        int conOne = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                conOne++;
            }
            if (nums[i] == 0) {
                conOne = 0;
            }
            if (conOne > max) {
                max = conOne;
            }
        }
        return max;
    }

    static int findNumbers(int[] nums) {
        int ans = 0;

        for (int i : nums) {

            if (digitNum(i) % 2 == 0) {
                ans++;
            }

        }
        return ans;
    }

    static int digitNum(int a) {

        int count = 0;
        while (a > 0) {
            count++;
            a = a / 10;

        }

        return count;
    }

    static int[] sortedSquares(int[] nums) {
        int[] sorted = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            sorted[i] = nums[i] * nums[i];
            // System.out.println(sorted[i]);
        }
        Arrays.sort(sorted);

        return sorted;
    }

    static void duplicateZeroswitharray(int[] arr) {
        // [1,0,0,2,3,0,0,4]
        int temp = 0;
        ArrayList<Integer> a = new ArrayList<>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            a.add(arr[i]);
            if (arr[i] == 0) {
                a.add(0);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a.get(i);
        }
    }

    static void duplicateZeros(int[] arr) {
        // [1,0,0,2,3,0,0,4]
        int temp = 0;
        ArrayList<Integer> a = new ArrayList<>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            a.add(arr[i]);
            if (arr[i] == 0) {
                a.add(0);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a.get(i);
        }
    }

    // processorTime = [8,10], tasks = [2,2,3,1,8,7,4,5]
    static int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {

        // [33,320]
        // [132,68,232,166,30,300,112,138]

        int p1 = Integer.MAX_VALUE;
        int p2 = Integer.MIN_VALUE;
        int p1t = 0;
        int p2t = 0;
        Collections.sort(tasks);
        System.out.println(tasks);
        for (int i = 0; i < tasks.size(); i++) {
            if (i > (tasks.size() / 2) - 1) {
                // int p1 = Math.min(processorTime.get(0), processorTime.get(1));
                for (Integer pro : processorTime) {
                    if (pro < p1) {
                        p1 = pro;
                    }
                }
                if (p1 + tasks.get(i) > p1t) {
                    p1t = p1 + tasks.get(i);
                }
            } else {

                // p2 = Math.max(processorTime.get(0), processorTime.get(1));
                for (Integer pro : processorTime) {
                    if (pro > p2) {
                        p2 = pro;
                    }
                }
                if (p2 + tasks.get(i) > p2t) {
                    p2t = p2 + tasks.get(i);
                }

            }
        }
        System.out.println(p1t);
        System.out.println(p2t);
        return Math.max(p1t, p2t);
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }

        Arrays.sort(nums1);

        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);

        }

    }

    static int removeElement(int[] nums, int val) {
        // int ans = 0;
        // ArrayList<Integer> ar = new ArrayList<>();
        // for (int i : nums) {
        // if (i != val) {
        // ar.add(i);
        // }

        // }

        // for (int i = 0; i < ar.size(); i++) {
        // nums[i] = ar.get(i);
        // System.out.println(nums[i]);
        // }

        // return ar.size();
        // }

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }

        return count;

    }

    static int removeDuplicates(int[] nums) {
        int a = 0;

        int[] arr = new int[nums.length];
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                arr[j++] = nums[i];

            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
        return j;

    }

    static long maximumTripletValue(int[] nums) {

        long a = Long.MIN_VALUE;
        long best = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int j2 = j + 1; j2 < nums.length; j2++) {
                    best = Math.max(best, (long) (nums[i] - nums[j]) * nums[j2]);
                    System.out.println(best);
                }
            }

        }
        return best;

    }

    static boolean checkIfExist(int[] arr) {

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] * 2 == arr[j]) {
                        return true;
                    }
                }
            }
        }
        return false;

    }

    static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {

        int count = 0;
        for (int i : hours) {
            if (i >= target) {
                count++;
            }

        }
        return count;
    }

    static int smallestEvenMultiple(int n) {
        int ans = 0;
        for (int i = 1; i <= n * 2; i++)
            if (i % 2 == 0 && n % i == 0) {
                ans = i;
            }

        return ans;
    }

    static int countPairs(List<Integer> nums, int target) {

        int ans = 0;
        int count = 0;

        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {

                if (nums.get(i) + nums.get(j) < target) {
                    count++;
                    System.out.println("i: " + i + " " + nums.get(i));
                    System.out.println("j: " + j + " " + nums.get(j));
                }
            }
        }
        return count;

    }

    static boolean isStrictlyPalindromic(int n) {
        boolean ans = false;

        for (int i = 2; i < n - 2; i++) {
            String s = Integer.toString(n, i);
            ans = isPalandrome(s);
            if (ans == false) {
                break;
            }

        }
        return ans;

    }

    public static boolean isPalandrome(String n) {
        char[] arr = n.toCharArray();
        boolean ans = true;
        int j = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {

            if (arr[i] != arr[j]) {
                ans = false;
                break;
            }
            System.out.println("i: " + i + " j: " + j--);

        }

        return ans;

    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> ans = new ArrayList<>();

        int maxCandy = 0;
        for (Integer candi : candies) {

            if (candi > maxCandy) {
                maxCandy = candi;
            }

        }
        System.out.println(maxCandy);

        for (Integer candi : candies) {

            if (candi + extraCandies >= maxCandy) {
                ans.add(true);
            } else {
                ans.add(false);
            }

        }

        return ans;

    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i] && i != j) {
                    System.out.println(nums[i]);
                    count++;
                }

                ans[i] = count;
            }
            System.out.print(count);
        }

        return ans;
    }

    static public int mostWordsFound(String[] sentences) {
        // int ans = 0;
        int count = 0;
        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            if (words.length > count) {
                count = words.length;
            }
        }

        return count;
    }

    static public int countValidWords(String sentence) {
        int count = 0;
        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            for (String word : words) {
                if (word.matches(".*\\d.*")) {
                    break;
                }
                if (word.matches("^-.*|.*-$")) {
                    break;
                }
            }
            if (words.length > count) {
                count = words.length;
            }
        }

        return count;
    }
}

class ParkingSystem {

    int big, medium, small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {

        boolean isAvailable = false;
        if (carType == 1 && big - 1 >= 0) {
            big--;
            isAvailable = true;
        } else if (carType == 2 && medium - 1 >= 0) {
            medium--;
            isAvailable = true;
        } else if (carType == 3 && small - 1 >= 0) {
            small--;
            isAvailable = true;
        }
        return isAvailable;
    }
}
