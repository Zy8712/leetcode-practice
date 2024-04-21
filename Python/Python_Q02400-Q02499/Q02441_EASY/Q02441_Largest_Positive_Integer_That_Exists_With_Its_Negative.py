class Solution(object):
    def findMaxK(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort(reverse=True)
        for i in range(len(nums)):
            if (nums[i] * -1) in nums:
                return nums[i]
            elif nums[i] < 0:
                return -1
        return -1
                                
