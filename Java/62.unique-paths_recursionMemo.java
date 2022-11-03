import java.util.Arrays;

/*
 * @lc app=leetcode id=62 lang=java
 *
 * [62] Unique Paths
 */

// @lc code=start
class Solution {
    private int[][] memo;

    private int helper(int m, int n) {
        if (m <= 0 || n <= 0)
            return 0;
        if (m == 1 || n == 1)
            return 1;
        
        if (memo[m][n] == -1) {
            memo[m][n] = helper(m, n - 1) + helper(m - 1, n);
        }

        return memo[m][n];
    }

    public int uniquePaths(int m, int n) {
        memo = new int[m+1][n+1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                memo[i][j] = -1;
            }
        }
        return helper(m, n);
    }
}
// @lc code=end

