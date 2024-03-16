// You are given an array ‘ARR’ of length ‘N’ consisting of only ‘0’s and ‘1’s. Your task is to determine the maximum length of the consecutive number of 1’s.

// For Example:
// ARR = [0, 1, 1, 0, 0, 1, 1, 1], here you can see the maximum length of consecutive 1’s is 3. Hence the answer is 3.

// link:https://www.codingninjas.com/studio/problems/maximum-consecutive-ones_3843993?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems

import java.util.*;
import java.io.*;

public class MaxConsecutive {
    public static int consecutiveOnes(int n, int[] arr) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        return max;
    }
}