import java.util.Stack;

/*
 * @lc app=leetcode id=844 lang=java
 *
 * [844] Backspace String Compare
 */

// @lc code=start
class Solution {
    private String helper(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (stack.empty())
                    continue;
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.toString();
    }

    public boolean backspaceCompare(String s, String t) {
        return helper(s).equals(helper(t));
    }
}
// @lc code=end

