/*
 * @lc app=leetcode id=844 lang=java
 *
 * [844] Backspace String Compare
 */

// @lc code=start
class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1, j = t.length() - 1;
        int skipS = 0, skipT = 0;

        while (i >= 0 || j >= 0) { // make sure to fully traverse the two strings
            while (i >= 0) { // stop at the position of next actual char in s.
                if (s.charAt(i) == '#') {skipS++; i--;}
                else if (skipS > 0) {skipS--; i--;}
                else break;
            }
            while (j >= 0) { // stop at the position of next actual char in t.
                if (t.charAt(j) == '#') {skipT++; j--;}
                else if (skipT > 0) {skipT--; j--;}
                else break;
            }

            if (i == -1 && j == -1) return true;
            if (i < 0 || j < 0) return false;
            // if two actual chars are different
            if (s.charAt(i) != t.charAt(j)) return false;           
            i--; j--;
        }
        return true;
    }
}
// @lc code=end

