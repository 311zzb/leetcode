import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        int[] pCount = new int[26];
        int[] sCount = new int[26];
        // build reference array using string p
        for (char c : p.toCharArray()) {
            pCount[charToInt(c)]++;
        }

        List<Integer> output = new ArrayList<>();
        // sliding window on the string s
        for (int i = 0; i < ns; i++) {
            // add one more letter on the right side of the window
            sCount[charToInt(s.charAt(i))]++;
            // remove one letter from the left side of the window
            if (i >= np)
                sCount[charToInt(s.charAt(i - np))]--;
            // compare array in the sliding window with the reference array
            if (Arrays.equals(sCount, pCount))
                output.add(i - np + 1);
        }
        return output;
    }

    private int charToInt (char c) {
        return (int) c - 'a';
    }
}
// @lc code=end

