class Solution(object):
    def countOdds(self, low, high):
        """
        :type low: int
        :type high: int
        :rtype: int
        """
        count = 0
        if high - low == 1:
            return 1
        elif low % 2 == 0 and high % 2 == 0:
            return (high - low)/2
        elif low % 2 != 0 and high % 2 != 0:
            return ((high - low)/2)+1
        else:
            return ((high - low)/2)+1

        return count