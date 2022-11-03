/*
 * @lc app=leetcode id=392 lang=java
 *
 * [392] Is Subsequence
 */

// @lc code=start
class Solution {
    String source, target;
    Integer leftBound, rightBound;

    private boolean rec_isSubsequence(int leftIndex, int rightIndex) {
        // Base cases
        if (leftIndex == leftBound) { // Finished the source string.
            return true;
        }
        if (rightIndex == rightBound) { // Exhausted the target string.
            return false;
        }

        // Consume both strings or just the target string
        if (source.charAt(leftIndex) == target.charAt(rightIndex)) {
            leftIndex++;
        }
        rightIndex++;

        return rec_isSubsequence(leftIndex, rightIndex);
    }

    public boolean isSubsequence(String s, String t) {
        this.source = s;
        this.target = t;
        this.leftBound = s.length();
        this.rightBound = t.length();

        return rec_isSubsequence(0, 0);
    }
}
// @lc code=end

