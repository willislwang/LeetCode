# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    count = 0
    def kthSmallest(self, root: TreeNode, k: int) -> int:
        self.count = 1
        return self.kthSmallestHelper(root, k)
    
    def kthSmallestHelper(self, root, k):
        a = None
        if root.left != None:
            a = self.kthSmallestHelper(root.left, k)
            if a != None:
                return a
        if self.count == k:
            return root.val
        else:
            self.count += 1
        if root.right != None:
            a = self.kthSmallestHelper(root.right, k)
            if a != None:
                return a
        return a


