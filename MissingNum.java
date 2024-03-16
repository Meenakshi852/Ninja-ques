// Given an array ‘a’ of size ‘n’-1 with elements of range 1 to ‘n’. The array does not contain any duplicates. Your task is to find the missing number.

//For example:
//Input:
// 'a' = [1, 2, 4, 5], 'n' = 5

// Output : 3

// link :https://www.codingninjas.com/studio/problems/missing-number_6680467?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems

public class MissingNum {
    public static int missingNumber(int[] a, int N) {
        for (int i = 1; i <= N; i++) {
            int flag = 0;
            for (int j = 0; j < N; j++) {
                if (a[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                return i;
            }
        }
        return N;
    }
}