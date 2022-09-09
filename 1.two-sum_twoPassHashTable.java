import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        // Pass 1: assign the integers in NUMS as the key of MAP, indecies as the values of MAP.
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        // Pass 2: loop though the original array and search for complement in MAP.
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }
        return null;
    }
}
// @lc code=end

