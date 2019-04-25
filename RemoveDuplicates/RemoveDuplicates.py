class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        index = 0
        last_num = None;
        while (index < len(nums)):
            if nums[index] == last_num:
                del nums[index]
            else:
                last_num = nums[index] 
                index += 1
        return len(nums)
        
