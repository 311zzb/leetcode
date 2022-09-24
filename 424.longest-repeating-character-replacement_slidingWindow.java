import java.util.HashMap;

/*
 * @lc app=leetcode id=424 lang=java
 *
 * [424] Longest Repeating Character Replacement
 */

// @lc code=start
class Solution {
    private int getBiggestCount(HashMap<Character, Integer> count) {
        int biggestCount = 0;
        for (int x : count.values()) {
            if (x > biggestCount) biggestCount = x;
        }
        return biggestCount;
    }

    public int characterReplacement(String s, int k) {
        if (k == s.length()) return k;

        int result = 0;
        int l = 0, r = 0;
        int biggestCount;
        HashMap<Character, Integer> count = new HashMap<>();
        while (r < s.length()) {
            // right end of the window
            r += 1;
            char cr = s.charAt(r - 1);
            if (count.containsKey(cr)) {
                count.put(cr, count.get(cr) + 1);
            } else {
                count.put(cr, 1);
            }

            biggestCount = getBiggestCount(count);
            boolean validWindow = r - l - biggestCount <= k;

            while (!validWindow) {
                // left end of the window
                l += 1;
                char cl = s.charAt(l - 1);
                if (count.get(cl) > 1) {
                    count.put(cl, count.get(cl) - 1);
                } else {
                    count.remove(cl);
                }
                biggestCount = getBiggestCount(count);
                validWindow = r - l - biggestCount <= k;
            }
            
            if (r - l > result) result = r - l;
            }
        return result;
    }
}
// @lc code=end

