/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minSoFar = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < minSoFar) {
                minSoFar = price;
            } else {
                int profit = price - minSoFar;
                maxProfit = profit > maxProfit ? profit : maxProfit;
            }
        }
        return maxProfit;
    }
}
// @lc code=end

