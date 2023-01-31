#
# @lc app=leetcode id=409 lang=python3
#
# [409] Longest Palindrome
#

# @lc code=start
class Solution:
    def longestPalindrome(self, s: str) -> int:
        ans = 0
        unique_letter = set()
        for c in s:
            unique_letter.add(c)

        for c in unique_letter:  #
            ans += int(s.count(c) / 2) * 2

        if ans < len(s):  # add an unique center
            ans += 1
        return ans
# @lc code=end
