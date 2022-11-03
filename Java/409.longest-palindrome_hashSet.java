import java.util.HashSet;

/*
 * @lc app=leetcode id=409 lang=java
 *
 * [409] Longest Palindrome
 */

// @lc code=start
class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (set.contains(c)) {
                set.remove(c);
            } else {
                set.add(c);
            }
        }
        int lengthOfMirror = s.length() - set.size();
        if (lengthOfMirror == s.length()) {
            return s.length();
        } else {
            return lengthOfMirror + 1;
        }
    }
}
// @lc code=end

