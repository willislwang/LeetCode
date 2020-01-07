# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def searchBST(self, root: TreeNode, val: int) -> TreeNode:
        curr = root
        while curr != None:
            if curr.val == val:
                return curr
            elif val < curr.val:
                curr = curr.left
            else:
                curr = curr.right
        return None
