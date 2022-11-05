#
# @lc app=leetcode id=724 lang=python3
#
# [724] Find Pivot Index
#

# @lc code=start
class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        s = sum(nums)
        leftSum = 0
        for i in range(len(nums)):
            if s - nums[i] - leftSum == leftSum:
                return i
            leftSum += nums[i]
        return -1
# @lc code=end

