import java.util.HashSet;

/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 */

// @lc code=start
class Solution {
    HashSet<Integer> seen = new HashSet<>();

    public boolean isHappy(int n) {
        if (n == 1) return true;
        if (seen.contains(n)) return false;
        seen.add(n);

        int next = 0;
        while (n > 0) {
            int curr = n % 10;
            next += curr * curr;
            n = n / 10;
        }
        System.out.println(next);
        return isHappy(next);
    }
}
// @lc code=end

