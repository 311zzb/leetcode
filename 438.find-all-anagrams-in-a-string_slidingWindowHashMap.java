import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode id=438 lang=java
 *
 * [438] Find All Anagrams in a String
 */

// @lc code=start
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int ns = s.length(), np = p.length();
        if (ns < np) return new ArrayList<Integer>();

        Map<Character, Integer> pCount = new HashMap<>();
        Map<Character, Integer> sCount = new HashMap<>();
        // Build reference hashmap using string p
        for (char c : p.toCharArray()) {
            if (pCount.containsKey(c)) {
                pCount.put(c, pCount.get(c) + 1);
            } else {
                pCount.put(c, 1);
            }
        }

        List<Integer> output = new ArrayList<>();
        // Sliding window on the string s
        for (int i = 0; i < ns; i++) {
            // add one more letter
            // on the right side of the window
            char c = s.charAt(i);
            if (sCount.containsKey(c)) {
                sCount.put(c, sCount.get(c) + 1);
            } else {
                sCount.put(c, 1);
            }
            // remove one letter
            // from the left side of the window
            if (i >= np) {
                c = s.charAt(i - np);
                if (sCount.get(c) == 1) {
                    sCount.remove(c);
                } else {
                    sCount.put(c, sCount.get(c) - 1);
                }
            }
            // compare hashmap in the sliding window
            // with the reference hashmap
            if (pCount.equals(sCount))
                output.add(i - np + 1);
        }
        return output;
    }
    
}
// @lc code=end

