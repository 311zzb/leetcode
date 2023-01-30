#
# @lc app=leetcode id=1137 lang=python3
#
# [1137] N-th Tribonacci Number
#

# @lc code=start
class Solution:
    d = {0:0, 1:1, 2:1}

    def tribonacci(self, n: int) -> int:
        if n in self.d:
            return self.d[n]
        self.d[n] = self.tribonacci(n-3) + self.tribonacci(n-2) + self.tribonacci(n-1)
        return self.d[n]
# @lc code=end

