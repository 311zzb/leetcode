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
    private boolean rec_isValidBST(TreeNode root, Integer low, Integer high) {
        if (root == null) 
            return true;
        if ((low != null && root.val <= low) || (high != null && root.val >= high))
            return false;
        return rec_isValidBST(root.right, root.val, high) &&( rec_isValidBST(root.left, low, root.val));
    }

    public boolean isValidBST(TreeNode root) {
        return rec_isValidBST(root, null, null); 
    }
}
// @lc code=end
