#
# @lc app=leetcode id=589 lang=python3
#
# [589] N-ary Tree Preorder Traversal
#

# @lc code=start
"""
# Definition for a Node.
class Node:
    def __init__(self, val=None, children=None):
        self.val = val
        self.children = children
"""

class Solution:
    def __init__(self):
        self.result = []

    def preorder(self, root: 'Node') -> List[int]:        
        self.helper(root)
        return self.result

    def helper(self, node):
        if node is None:
            return
        self.result.append(node.val)
        for child in node.children:
            self.helper(child)
# @lc code=end

