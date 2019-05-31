import collections

class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        #Bit Manipulation (one liner!)
        #return reduce(lambda x, y: x ^ y, nums)
        
        #Hash Table with dict comprehension xd
        return {v: k for k, v in collections.Counter(nums).items()}[1]
        
        
