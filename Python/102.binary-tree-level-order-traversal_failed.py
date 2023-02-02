#
# @lc app=leetcode id=102 lang=python3
#
# [102] Binary Tree Level Order Traversal
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
import collections

class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if root is None:
            return []
        
        result = []

        d = collections.deque()
        d.append(root)
        while d:
            level = []
            next = []
            while d:
                curr = d.pop()
                level.append(curr.val)
                if curr.right:
                    next.append(curr.right)
                if curr.left:
                    next.append(curr.left)
            d.extend(next)
            result.append(level)
        
        return result
# @lc code=end

