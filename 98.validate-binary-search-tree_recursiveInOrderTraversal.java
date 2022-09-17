/*
 * @lc app=leetcode id=98 lang=java
 *
 * [98] Validate Binary Search Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private Integer prev = null;

    private boolean inorderCheck(TreeNode root) {
        if (root == null)
            return true;
        if (!inorderCheck(root.left))
            return false;
        if (prev != null && root.val <= prev)
            return false;
        prev = root.val;
        return inorderCheck(root.right);
    }

    public boolean isValidBST(TreeNode root) {
        return inorderCheck(root);
    }
}
// @lc code=end

