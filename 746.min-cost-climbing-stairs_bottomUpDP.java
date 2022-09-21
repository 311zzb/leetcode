/*
 * @lc app=leetcode id=746 lang=java
 *
 * [746] Min Cost Climbing Stairs
 */

// @lc code=start
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // The array's length should be 1 longer than the legth of cost
        // This is because we can treat the "top floor" as a setp to reach
        int minimumCost[] = new int[cost.length + 1];
    
        // Start iteration from step 2, since the minimum costs of reaching
        // step 0 and step 1 are both 0
        for (int i = 2; i < minimumCost.length; i++) {
            int takeOneStep = minimumCost[i - 1] + cost[i - 1];
            int takeTwoStep = minimumCost[i - 2] + cost[i - 2];
            minimumCost[i] = Math.min(takeOneStep, takeTwoStep);
        }

        // The final element in minimumCost refers to the top floor
        return minimumCost[minimumCost.length - 1];
    }
}
// @lc code=end

