#
# @lc app=leetcode id=198 lang=python3
#
# [198] House Robber
#

# @lc code=start
class Solution:
    def __init__(self) -> None:
        self.memo = {}

    def rob(self, nums: List[int]) -> int:
        return self.robFrom(0, nums)

    def robFrom(self, i, nums):
        if i >= len(nums):
            return 0

        if i in self.memo:
            return self.memo[i]

        rob_this = nums[i] + self.robFrom(i + 2, nums)
        not_rob_this = 0 + self.robFrom(i + 1, nums)
        ans = max(rob_this, not_rob_this)

        # Record the maximum gain from robbing this house and get on
        self.memo[i] = ans 
        return ans
# @lc code=end

