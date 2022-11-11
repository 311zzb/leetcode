#
# @lc app=leetcode id=392 lang=python3
#
# [392] Is Subsequence
#

# @lc code=start
class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        if len(s) == 0:
            return True
        if len(t) < len(s):
            return False
        if s[0] == t[0]:
            return self.isSubsequence(s[1:], t[1:])
        return self.isSubsequence(s, t[1:])
# @lc code=end

