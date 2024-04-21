class Solution(object):
    def maxScore(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort(reverse=True)
        sum = 0
        count = 0
        for i in range(len(nums)):
            sum += nums[i]
            if sum > 0:
                count += 1
        return count