import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=205 lang=java
 *
 * [205] Isomorphic Strings
 */

// @lc code=start
class Solution {
    private String strTransform(String s) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder transformed = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (!map.containsKey(curr)) {
                map.put(curr, i);
            }
            transformed.append(map.get(curr));
            transformed.append(" ");
        }
        return transformed.toString();
    }

    public boolean isIsomorphic(String s, String t) {
        return strTransform(s).equals(strTransform(t));
    }
}
// @lc code=end

