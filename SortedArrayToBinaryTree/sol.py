# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def sortedArrayToBST(self, nums):
        """
        :type nums: List[int]
        :rtype: TreeNode
        """
        if (nums == []):
            return
        elif len(nums) == 1:
            return TreeNode(nums[0])
    
        val = nums[len(nums)/2]
        rightArr = nums[len(nums)/2 + 1:]
        leftArr = nums[:len(nums)/2]
        return TreeNode(val, self.sortedArrayToBST(leftArr), self.sortedArrayToBST(rightArr))
