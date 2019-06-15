class Solution(object):

    
    def countPrimes(self, n):
        """
        :type n: int
        :rtype: int
        """
        def isPrime(n):
            if n == 1: return False
            if n <= 3: return True
            for i in range(2, n // 2 + 1):
                if n % i == 0:
                    return False
            return True
        
        
        num = 0
        for i in range(1, n):
            if isPrime(i):
                num += 1 
                print(i)
        return num
    

