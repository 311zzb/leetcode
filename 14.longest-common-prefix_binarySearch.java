/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLen = Integer.MAX_VALUE;
        for (String str : strs)
            minLen = Math.min(minLen, str.length());
        
        int low = 1, high = minLen;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isCommonPrefix(strs, mid))
                low = mid + 1;
            else 
                high = mid - 1;
        }
        return strs[0].substring(0, low + (high - low) / 2 - 1);
    }

    private boolean isCommonPrefix(String[] strs, int len) {
        String str1 = strs[0].substring(0, len);
        for (String str : strs) {
            if (!str.startsWith(str1))
                return false;
        }
        return true;
    }
}
// @lc code=end

