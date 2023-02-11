class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if x < 0:
            return False
        
        numString = str(x)
        for i in range(len(numString)/2):
            if(numString[i] != numString[len(numString)-i-1]):
                return False
        
        return True