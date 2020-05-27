class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        seen = {}
        for i in range(len(nums)):
            x = seen.get(target - nums[i])
            if x != None:
                return [i, x]
            seen[nums[i]] = i
        return None
