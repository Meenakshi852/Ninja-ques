//You are given an array ‘arr’ containing ‘n’ integers. You are also given an integer ‘num’, and your task is to find whether ‘num’ is present in the array or not.

// If ‘num’ is present in the array, return the 0-based index of the first occurrence of ‘num’. Else, return -1.

// Example:
// Input: ‘n’ = 5, ‘num’ = 4 
// 'arr' =  [6,7,8,4,1] 

// Output: 3

// link : https://www.codingninjas.com/studio/problems/linear-search_6922070?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems

#include <vector>

int linearSearch(int n, int num, std::vector<int> &arr) {
    // Iterate through the vector
    for (int i = 0; i < arr.size(); i++) {
        // If the current element matches the target number, return its index
        if (arr[i] == num) {
            return i;
        }
    }
    // If the number is not found, return -1
    return -1;
}
