import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    HashMap<Integer, TreeSet<Integer>> map = new HashMap<>();

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i]))
                map.put(nums[i], new TreeSet<Integer>());
            map.get(nums[i]).add(i);

            int need = target - nums[i];
            if (!map.containsKey(need))
                continue;
            for (int x : map.get(need)) {
                if (x != i)
                    return new int[]{i, x};
            }
        }
        return null;
    }
}
// @lc code=end

