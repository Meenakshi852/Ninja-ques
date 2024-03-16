//Given two sorted arrays, ‘a’ and ‘b’, of size ‘n’ and ‘m’, respectively, return the union of the arrays.

//The union of two sorted arrays can be defined as an array consisting of the common and the distinct elements of the two arrays. The final array should be sorted in ascending order.

// Example:
// Input: ‘n’ = 5 ‘m’ = 3
// ‘a’ = [1, 2, 3, 4, 6]
// ‘b’ = [2, 3, 5]

// Output: [1, 2, 3, 4, 5, 6]

// link : https://www.codingninjas.com/studio/problems/sorted-array_6613259?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems

import java.util.*;

public class UnionSorted {
    public static List<Integer> sortedArray(int[] a, int[] b) {
        int i = 0, j = 0; // pointers
        int n = a.length;
        int m = b.length;
        ArrayList<Integer> Union = new ArrayList<>();
        while (i < n && j < m) {
            if (a[i] <= b[j]) // Case 1 and 2
            {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != a[i])
                    Union.add(a[i]);
                i++;
            } else // case 3
            {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != b[j])
                    Union.add(b[j]);
                j++;
            }
        }
        while (i < n) // IF any element left in arr1
        {
            if (Union.get(Union.size() - 1) != a[i])
                Union.add(a[i]);
            i++;
        }
        while (j < m) // If any elements left in arr2
        {
            if (Union.get(Union.size() - 1) != b[j])
                Union.add(b[j]);
            j++;
        }
        return Union;

    }
}