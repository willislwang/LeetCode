class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if 
        asdf = {}
        for i in nums:
            if i in asdf:
                asdf[i] += 1
                if asdf[i] > len(nums) / 2:
                    return i
            else:
                asdf[i] = 1
        return 0
