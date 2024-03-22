// There is an integer array ‘a’ of size ‘n’.

// An element is called a Superior Element if it is greater than all the elements present to its right.

// You must return an array all Superior Elements in the array ‘a’.

// Example
// Input: a = [1, 2, 3, 2], n = 4

// Output: 2 3

// link : https://www.codingninjas.com/studio/problems/superior-elements_6783446?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems&leftPanelTabValue=PROBLEM

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuperiorEle {
    public static List<Integer> superiorElements(int[] a) {
        List<Integer> superior = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            boolean leader = true;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] >= a[i]) {
                    leader = false;
                    break;
                }
            }
            if (leader == true) {
                superior.add(a[i]);
            }
        }
        Collections.sort(superior);
        return superior;
    }

}
