#
# @lc app=leetcode id=70 lang=python3
#
# [70] Climbing Stairs
#

# @lc code=start
class Solution:
    d = {0:0, 1:1, 2:2}
    def climbStairs(self, n: int) -> int:
        if n in self.d:
            return self.d[n]
        self.d[n] = self.climbStairs(n - 1) + self.climbStairs(n - 2)
        return self.d[n]
# @lc code=end

