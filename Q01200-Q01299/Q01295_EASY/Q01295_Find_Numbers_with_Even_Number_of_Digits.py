class Solution(object):
    def findNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        counter = 0
        for i in range(len(nums)):
            length = len(str(nums[i]))
            if length % 2 == 0:
                counter += 1
        return counter