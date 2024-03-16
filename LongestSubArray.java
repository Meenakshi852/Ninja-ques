// You are given an array 'a' of size 'n' and an integer 'k'.

// Find the length of the longest subarray of 'a' whose sum is equal to 'k'.

// Example :
// Input: ‘n’ = 7 ‘k’ = 3
// ‘a’ = [1, 2, 3, 1, 1, 1, 1]

//Output: 3

// link :https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_6682399?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems

public class LongestSubArray {
    public static int longestSubarrayWithSumK(int[] a, long k) {
        int n = a.length;
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int j = i; j < n; j++) {
                sum += a[j];
                if (sum == k) {
                    // If the current sum equals k, update the maxLength
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        return maxLength;
    }
}
