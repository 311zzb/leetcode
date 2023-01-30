#
# @lc app=leetcode id=509 lang=python3
#
# [509] Fibonacci Number
#

# @lc code=start
class Solution:
    dict = {0:0, 1:1}

    def fib(self, n: int) -> int:
        if n in self.dict:
            return self.dict[n]
        self.dict[n] = self.fib(n - 1) + self.fib(n - 2)
        return self.dict[n]
# @lc code=end

