/*
 * @lc app=leetcode id=704 lang=java
 *
 * [704] Binary Search
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int index = (right - left) / 2 + left;
            int curr = nums[index];
            if (curr == target) {
                return index;
            } else if (curr < target) {
                left = index + 1;
            } else {
                right = index;
            }
        }
        return -1;
    }
}
// @lc code=end

