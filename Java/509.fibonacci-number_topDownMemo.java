import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=509 lang=java
 *
 * [509] Fibonacci Number
 */

// @lc code=start
class Solution {
    Map<Integer, Integer> memo = new HashMap<>();

    public int fib(int n) {
        if (n <= 1)
            return n;
        if (!memo.containsKey(n))
            memo.put(n, fib(n - 1) + fib(n - 2));
        return memo.get(n);
    }
}
// @lc code=end

