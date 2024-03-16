// You are given a sorted array 'arr' of positive integers of size 'n'.

// It contains each number exactly twice except for one number, which occurs exactly once.

// Find the number that occurs exactly once.

// Example :
// Input: ‘arr’ = {1, 1, 2, 3, 3, 4, 4}.

// Output: 2

//link : https://www.codingninjas.com/studio/problems/find-the-single-element_6680465?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems

public class SingleElement {
    public static int getSingleElement(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == num) {
                    count++;
                }
            }
            if (count == 1) {
                return num;
            }
        }
        return -1; // Return -1 if no single element is found
    }
}