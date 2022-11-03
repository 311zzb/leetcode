/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    private String findSame(String s1, String s2) {
        int l1 = s1.length(), l2 = s2.length();
        int l = l1 <= l2 ? l1 : l2;
        for (int i = 0; i < l; i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return s1.substring(0, i);
        }
        return s1.substring(0, l);
    }

    public String longestCommonPrefix(String[] strs) {
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            result = findSame(result, strs[i]);
        }
        return result;
    }
}
// @lc code=end

