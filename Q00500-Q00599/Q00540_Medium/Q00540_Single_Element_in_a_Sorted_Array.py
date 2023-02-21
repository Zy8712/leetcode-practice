class Solution(object):
    def singleNonDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) == 1:
            return nums[0]
        prev = 1
        downPrev = len(nums)-2
        for i in range(0, len(nums), 2):
            if prev > (len(nums)/2)+1:
                break
            if nums[prev] != nums[i]:
                if nums[prev] != nums[prev-1] and nums[prev] != nums[prev+1]:
                    return nums[prev]
                else: 
                    return nums[i]
            elif  nums[downPrev] != nums[len(nums)-1-i]:
                if nums[downPrev] != nums[downPrev-1] and nums[downPrev] != nums[downPrev+1]:
                    return nums[downPrev]
                else: 
                    return nums[len(nums)-1-i]
            prev += 2
            downPrev -= 2
        return 0
        