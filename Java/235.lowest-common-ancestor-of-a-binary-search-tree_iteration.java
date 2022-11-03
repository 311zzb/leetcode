/*
 * @lc app=leetcode id=235 lang=java
 *
 * [235] Lowest Common Ancestor of a Binary Search Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int pVal = p.val, qVal = q.val;

        while (root != null) {
            if (pVal < root.val && qVal < root.val) {
                // Both nodes in the left subtree
                root = root.left;
            } else if (pVal > root.val && qVal > root.val) {
                // Both nodes in the right subtree
                root = root.right;
            } else {
                // The lowest common ancestor
                return root;
            }
        }
        return null;
    }
}
// @lc code=end

