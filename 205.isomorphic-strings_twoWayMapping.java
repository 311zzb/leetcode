import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=205 lang=java
 *
 * [205] Isomorphic Strings
 */

// @lc code=start
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sTotMap = new HashMap<>();
        Map<Character, Character> tTosMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i), tChar = t.charAt(i);

            if (tTosMap.containsKey(tChar)) {
                if (!tTosMap.get(tChar).equals(sChar)) {
                    return false;
                }
            } else {
                tTosMap.put(tChar, sChar);
            }

            if (sTotMap.containsKey(sChar)) {
                if (!sTotMap.get(sChar).equals(tChar)) {
                    return false;
                }
            } else {
                sTotMap.put(sChar, tChar);
            }
        }
        return true;
    }
}
// @lc code=end

