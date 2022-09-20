import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    Map<Integer, Integer> memo = new HashMap<>();

    public int climbStairs(int n) {
        if (n < 0)
            return 0;
        if (n == 0 || n == 1)
            return 1;

        if (!memo.containsKey(n))
            memo.put(n, climbStairs(n - 1) + climbStairs(n - 2));
        return memo.get(n);
    }
}
// @lc code=end

