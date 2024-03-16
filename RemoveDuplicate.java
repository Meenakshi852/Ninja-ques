//You are given a sorted integer array 'arr' of size 'n'.

//You need to remove the duplicates from the array such that each element appears only once.

//Return the length of this new array.

//For example:
// 'n' = 5, 'arr' = [1 2 2 2 3].
// The new array will be [1 2 3].
// So our answer is 3.

// link : https://www.codingninjas.com/studio/problems/remove-duplicates-from-sorted-array_1102307?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems

public class RemoveDuplicate {
    public static int removeDuplicates(int[] arr, int n) {
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;

            }
        }
        return (i + 1);
    }
}
