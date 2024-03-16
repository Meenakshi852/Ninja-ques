//Given an array ‘arr’ of size ‘n’ find the largest element in the array.

//Example:

// Input: 'n' = 5, 'arr' = [1, 2, 3, 4, 5]

// link:https://www.codingninjas.com/studio/problems/largest-element-in-the-array-largest-element-in-the-array_5026279?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems

//solution :

import java.util.*;
import java.io.*;

public class LargestElement {

    static int largestElement(int[] arr, int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }
}