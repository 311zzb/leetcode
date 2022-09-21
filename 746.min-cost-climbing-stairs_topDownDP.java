import java.util.HashMap;

/*
 * @lc app=leetcode id=746 lang=java
 *
 * [746] Min Cost Climbing Stairs
 */

// @lc code=start
class Solution {
    private HashMap<Integer, Integer> memo = new HashMap<>();

    private int minimumCost(int i, int[] cost) {
        if (i <= 1) 
            return 0;
            
        if (!memo.containsKey(i)) {
            int downOne = cost[i - 1] + minimumCost(i - 1, cost);
            int downTwo = cost[i - 2] + minimumCost(i - 2, cost);
            memo.put(i, Math.min(downOne, downTwo));
        }
        return memo.get(i);
    }

    public int minCostClimbingStairs(int[] cost) {
        return minimumCost(cost.length, cost);
    }
}
// @lc code=end

