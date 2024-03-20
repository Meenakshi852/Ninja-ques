// You are given an array/list 'prices' where the elements of the array represent the prices of the stock as they were yesterday and indices of the array represent minutes. Your task is to find and return the maximum profit you can make by buying and selling the stock. You can buy and sell the stock only once.

// Note:

// You can’t sell without buying first.
// For Example:
// For the given array [ 2, 100, 150, 120],
// The maximum profit can be achieved by buying the stock at minute 0 when its price is Rs. 2 and selling it at minute 2 when its price is Rs. 150.
// So, the output will be 148. 

// link:- https://www.codingninjas.com/studio/problems/stocks-are-profitable_893405?source=youtube&campaign=striver_dp_videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_dp_videos&leftPanelTabValue=PROBLEM 

import java.util.ArrayList;

public class BuyNSell {
    public static int maximumProfit(ArrayList<Integer> prices) {
        if (prices == null || prices.isEmpty()) {
            return 0;
        }

        int minPrice = prices.get(0);
        int maxProfit = 0;

        for (int i = 0; i < prices.size(); i++) {
            int currentPrice = prices.get(i);
            int profit = currentPrice - minPrice;
            maxProfit = Math.max(maxProfit, profit);
            minPrice = Math.min(minPrice, currentPrice);
        }

        return maxProfit;
    }
}