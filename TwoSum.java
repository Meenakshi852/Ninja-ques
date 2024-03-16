// Sam want to read exactly ‘TARGET’ number of pages.

// He has an array ‘BOOK’ containing the number of pages for ‘N’ books.

// Return YES/NO, if it is possible for him to read any 2 books and he can meet his ‘TARGET’ number of pages.

// Example:
// Input: ‘N’ = 5, ‘TARGET’ = 5
// ‘BOOK’ = [4, 1, 2, 3, 1] 

// Output: YES

// link : https://www.codingninjas.com/studio/problems/reading_6845742?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems

public class TwoSum {
    public static String read(int n, int[] book, int target) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (book[i] + book[j] == target) {
                    return "YES";
                }
            }
        }
        return "NO";
    }
}
