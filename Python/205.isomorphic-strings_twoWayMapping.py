#
# @lc app=leetcode id=205 lang=python3
#
# [205] Isomorphic Strings
#

# @lc code=start
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        dictXtoY, dictYtoX = {}, {}
        for (x, y) in zip(s, t):
            if x in dictXtoY.keys():
                if dictXtoY[x] != y:
                    return False
            else:
                dictXtoY[x] = y

            if y in dictYtoX.keys():
                if dictYtoX[y] != x:
                    return False
            else:
                dictYtoX[y] = x

        return True
# @lc code=end

