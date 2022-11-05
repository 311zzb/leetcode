#
# @lc app=leetcode id=1480 lang=python3
#
# [1480] Running Sum of 1d Array
#

# @lc code=start
class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        output = []
        output.append(0)
        for i in range(len(nums)):
            output.append(output[i] + nums[i])
        return output[1:]

# @lc code=end

