class Solution(object):
    def beautifulSubarrays(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count = 0
        xor_sum = 0
        freq = {0: 1}  
        for i in range(len(nums)):
            xor_sum ^= nums[i]
            if xor_sum in freq:
                count += freq[xor_sum]
            freq[xor_sum] = freq.get(xor_sum, 0) + 1
        return count