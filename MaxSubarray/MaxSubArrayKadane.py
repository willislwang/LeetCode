#The iterative KADANE!! solution (O(n))

class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        currSum = 0
        largestSum = nums[0]
        for i in nums:
            currSum += i
            if currSum > largestSum:
                largestSum = currSum
            if currSum < 0:
                currSum = 0
        return largestSum
