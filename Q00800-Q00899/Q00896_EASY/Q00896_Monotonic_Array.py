class Solution(object):
    def isMonotonic(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        if len(nums) <= 1:
            return True
        monotonicDecrease = False
        monotonicIncrease = False
        if nums[0] < nums[1]: # if monotonic increasing
            monotonicIncrease = True
        elif nums[0] > nums[1]: # if monotonic decreasing
            monotonicDecrease = True 
        else:
            for i in range(len(nums)-1):
                if nums[i] > nums[i+1]:
                    monotonicDecrease = True
                    break
                elif nums[i] < nums[i+1]:
                    monotonicIncrease = True
                    break
        
        if monotonicIncrease == False and monotonicDecrease == False:
            return True

        elif monotonicIncrease == True:
            for i in range(len(nums)-1):
                if nums[i] <= nums[i+1]:
                    continue
                else:
                    return False
            return True
        else:
            for i in range(len(nums)-1):
                if nums[i] >= nums[i+1]:
                    continue
                else:
                    return False
            return True
        
