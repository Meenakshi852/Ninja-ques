// You have been given an array/list 'arr' consisting of 'n' elements.

// Each element in the array is either 0, 1 or 2.

// Sort this array/list in increasing order.

// Do not make a new array/list. Make changes in the given array/list.

// Example :
// Input: 'arr' = [2, 2, 2, 2, 0, 0, 1, 0]

// Output: Final 'arr' = [0, 0, 0, 1, 2, 2, 2, 2]

// link : https://www.codingninjas.com/studio/problems/sort-an-array-of-0s-1s-and-2s_892977?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM

import java.io.*;
import java.util.ArrayList;

public class Sorting {
    public static void sortArray(ArrayList<Integer> arr, int n) {
        int low = 0;
        int high = n - 1;
        int mid = 0;
        int temp;

        while (mid <= high) {
            switch (arr.get(mid)) {
                case 0: {
                    temp = arr.get(low);
                    arr.set(low, arr.get(mid));
                    arr.set(mid, temp);
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = arr.get(mid);
                    arr.set(mid, arr.get(high));
                    arr.set(high, temp);
                    high--;
                    break;
                }
            }
        }
    }
}
