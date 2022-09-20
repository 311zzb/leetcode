/*
 * @lc app=leetcode id=509 lang=java
 *
 * [509] Fibonacci Number
 */

// @lc code=start
class Solution {
    public int fib(int n) {
        if (n <= 1)
            return n;

        int prevPrev = 0;
        int prev = 1;
        int curr = 1;
        for (int i = 2; i <= n; i++) {
            curr = prevPrev + prev;
            prevPrev = prev;
            prev = curr;
        }
        return curr;
    }
}
// @lc code=end

