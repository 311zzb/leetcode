import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/*
 * @lc app=leetcode id=102 lang=java
 *
 * [102] Binary Tree Level Order Traversal
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
    List<List<Integer>> levels = new ArrayList<List<Integer>>();
    
    private void helper(TreeNode node, int level) {
        // Base case
        if (node == null) {
            return;
        }

        // Start a new level in levels if needed
        if (levels.size() == level) {
            levels.add(new ArrayList<Integer>());
        }

        // Add the current node's value to levels
        // The order of adding values to the list is not level order.
        levels.get(level).add(node.val);

        // Recursively process the next level
        helper(node.left, level + 1);
        helper(node.right, level + 1);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        helper(root, 0);
        return levels;
    }
}
// @lc code=end

