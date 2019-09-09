#divide and conquer solution (O(nlogn))

class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        mid = len(nums) // 2
        if len(nums) == 1:
            return nums[0]
        else:
            return max(self.maxSubArray(nums[:mid]), self.maxSubArray(nums[mid:]), self.contSum(nums, mid))
    
    def contSum(self, nums, mid):
        leftSum, rightSum = -999999, -999999
        temp = 0
        for i in range(mid, -1, -1):
            temp += nums[i]
            if temp > leftSum:
                leftSum = temp
        temp = 0
        for i in range(mid, len(nums)):
            temp += nums[i]
            if temp > rightSum:
                rightSum = temp
        return leftSum + rightSum - nums[mid]
