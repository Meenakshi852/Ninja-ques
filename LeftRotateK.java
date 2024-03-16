//Given an array 'arr' with 'n' elements, the task is to rotate the array to the left by 'k' steps, where 'k' is non-negative.

// Example:
// 'arr '= [1,2,3,4,5]
// 'k' = 1  rotated array = [2,3,4,5,1]
// 'k' = 2  rotated array = [3,4,5,1,2]
// 'k' = 3  rotated array = [4,5,1,2,3] and so on.

// link : https://www.codingninjas.com/studio/problems/rotate-array_1230543?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems

import java.util.ArrayList;

public class LeftRotateK {
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        k = k % n;
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            temp.add(arr.get(i));

        }

        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        for (int i = n - k; i < n; i++) {
            arr[i] = temp[i - (n - k)];
        }

        return arr;
    }
}
