class Solution(object):
    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        # nums = nums[:-k % len(nums)]
        sec = nums[:-k % len(nums)]
        print(sec)
        del nums[:-k % len(nums)]
        nums.extend(sec)
