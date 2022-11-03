import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=589 lang=java
 *
 * [589] N-ary Tree Preorder Traversal
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    private List<Integer> rec_preorder(Node root, List<Integer> soFar) {
        if (root == null) {
            return soFar;
        }
        soFar.add(root.val);
        for (Node child : root.children) {
            rec_preorder(child, soFar);
        }
        return soFar;
    }

    public List<Integer> preorder(Node root) {
        return rec_preorder(root, new ArrayList<Integer>());
    }
}
// @lc code=end

