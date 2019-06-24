class Solution(object):
    def fizzBuzz(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        list = []
        for i in range(n):
            if (i + 1) % 15 == 0:
                list.append("FizzBuzz")
            elif (i + 1) % 5 == 0:
                list.append("Buzz")
            elif (i + 1) % 3 == 0:
                list.append("Fizz")
            else:
                list.append(str(i + 1))
        return list
            
