package org.ak;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

// Time Complexity: O(n), where n is the number of days. This is because the algorithm iterates through the list of prices once, performing constant-time operations for each price.

// Space Complexity: O(1), as it uses a constant amount of extra space (two variables to keep track of minPrice and maxProfit).

public class BestTimeToBuyAndSellStock_121 {
    public int maxProfit(int[] prices) {
        // Initialize minPrice to the maximum possible integer value
        int minPrice = Integer.MAX_VALUE;
        // Initialize maxProfit to 0
        int maxProfit = 0;

        for (int price : prices) {
            // Update minPrice to be the minimum of minPrice and the current price
            minPrice = Math.min(price, minPrice);
            // Update maxProfit to be the maximum of maxProfit and the difference between
            // the current price and minPrice
            maxProfit = Math.max(price - minPrice, maxProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock_121 solution = new BestTimeToBuyAndSellStock_121();
        int[] example1 = {3, 2, 6, 5, 0, 3};
        int[] example2 = {8, 6, 5, 2, 1};
        int[] example3 = {1, 2};
        System.out.println(solution.maxProfit(example1)); // Output: 4
        System.out.println(solution.maxProfit(example2)); // Output: 0
        System.out.println(solution.maxProfit(example3)); // Output: 1
    }
}
