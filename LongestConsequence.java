// There is an integer array ‘A’ of size ‘N’.

// A sequence is successive when the adjacent elements of the sequence have a
// difference of 1.

// You must return the length of the longest successive sequence.

// For example,
// Input: A = [5, 8, 3, 2, 1, 4], N = 6
// Output: 5

// link :
// https://www.codingninjas.com/studio/problems/longest-successive-elements_6811740?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems&leftPanelTabValue=PROBLEM

public class LongestConsequence {
    public static int longestSuccessiveElements(int[] a) {
        int n = a.length;
        int longest = 1;

        for (int i = 0; i < n; i++) {
            int x = a[i];
            int count = 1;

            while (linearSearch(a, x + 1)) {
                x = x + 1;
                count = count + 1;
            }

            longest = Math.max(longest, count);
        }

        return longest;
    }

    // Linear search implementation
    public static boolean linearSearch(int[] a, int target) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target)
                return true;
        }
        return false;
    }
}
