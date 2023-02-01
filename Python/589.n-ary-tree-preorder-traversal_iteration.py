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
    def preorder(self, root: 'Node') -> List[int]:
        traversal = []

        if root is None:
            return traversal
        
        stack = [root]
        while stack:
            node = stack.pop()
            traversal.append(node.val)
            stack.extend(reversed(node.children))

        return traversal

# @lc code=end

