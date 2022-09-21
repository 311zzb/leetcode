/*
 * @lc app=leetcode id=746 lang=java
 *
 * [746] Min Cost Climbing Stairs
 */

// @lc code=start
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int downOne = 0, downTwo = 0;
        for (int i = 2; i <= cost.length; i++) {
            int temp = downOne;
            downOne = Math.min(downOne + cost[i - 1], downTwo + cost[i - 2]);
            downTwo = temp;
        }
        return downOne;
    }
}
// @lc code=end

