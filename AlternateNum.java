// There is an array ‘A’ of size ‘N’ with an equal number of positive and negative elements.

// Without altering the relative order of positive and negative numbers, you must return an array of alternative positive and negative values.

// Note:
// Start the array with a positive number. 
// For example :
// Input:
// A = [1, 2, -4, -5], N = 4
// Output:
// 1 -4  2 -5

// link : https://www.codingninjas.com/studio/problems/alternate-numbers_6783445?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems&leftPanelTabValue=PROBLEM

public class AlternateNum {
    public static int[] alternateNumbers(int[] a) {
        int n = a.length;
        int[] temp = new int[n];
        int even = 0, odd = 1;

        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                temp[even] = a[i];
                even += 2;
            }
        }

        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                temp[odd] = a[i];
                odd += 2;
            }
        }

        return temp;
    }
}