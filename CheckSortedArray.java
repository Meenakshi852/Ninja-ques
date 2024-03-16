//You have been given an array ‘a’ of ‘n’ non-negative integers.You have to check whether the given array is sorted in the non-decreasing order or not.

//Your task is to return 1 if the given array is sorted. Else, return 0.

// Example :
// Input: ‘n’ = 5, ‘a’ = [1, 2, 3, 4, 5]
// Output: 1

// link : https://www.codingninjas.com/studio/problems/ninja-and-the-sorted-check_6581957?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems

// solution :

public class CheckSortedArray {
    public static int isSorted(int n, int[] a) {
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                return 0;
            }
        }
        return 1;
    }
}