import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if (root == null) 
            return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        int level = 0;
        while (!q.isEmpty()) {
            result.add(new LinkedList<Integer>());
            int level_size = q.size(); // The size of current level
            
            // Process all nodes in the current level
            for (int i = 0; i < level_size; i++) {
                TreeNode curr = q.poll();
                result.get(level).add(curr.val);
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
            level++;
        }
        return result;
    }
}
// @lc code=end

