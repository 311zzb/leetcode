#
# @lc app=leetcode id=121 lang=python3
#
# [121] Best Time to Buy and Sell Stock
#

# @lc code=start
class Solution:
    min_price = 10001
    max_profit = 0

    def maxProfit(self, prices: List[int]) -> int:
        for p in prices:
            if p - self.min_price > self.max_profit:
                self.max_profit = p - self.min_price
            elif p < self.min_price:
                self.min_price = p
        return self.max_profit
# @lc code=end

