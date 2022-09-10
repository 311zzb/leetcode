/*
 * @lc app=leetcode id=392 lang=java
 *
 * [392] Is Subsequence
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length()) {
            if (j == t.length()) {
                return false;
            }
            char sChar = s.charAt(i);
            char tChar = t.charAt(j);
            if (sChar == tChar) {
                i++;
            }
            j++;
        }
        return true;
    }
}
// @lc code=end

