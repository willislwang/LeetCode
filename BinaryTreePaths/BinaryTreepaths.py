# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def binaryTreePaths(self, root: TreeNode) -> List[str]:
        paths = []
        if root == None: return paths
        def traverse(self, root, prev):
            nonlocal paths
            if (root == None):
                return
            elif (root.right == None and root.left == None):
                paths += [prev + str(root.val)]
            else:
                traverse(self, root.right, prev + str(root.val) + "->")
                traverse(self, root.left, prev + str(root.val) + "->")
        
        traverse(self, root, "")
        return paths

        
