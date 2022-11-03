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
        int currVal = root.val, pVal = p.val, qVal = q.val;

        // Two nodes are both under the right child
        if (pVal > currVal && qVal > currVal)
            return lowestCommonAncestor(root.right, p, q);
        // Two nodes are both under the left child
        if (pVal < currVal && qVal < currVal)
            return lowestCommonAncestor(root.left, p, q);
        // We reach the lowest common ancestor
        return root;
    }
}
// @lc code=end

