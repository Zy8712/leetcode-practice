class Solution(object):
    def differenceOfSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        sum_val = 0
        for i in range(len(nums)):
            #print(nums[i])
            sum_val += nums[i]
        
        digital_sum = 0
        for j in range(len(nums)):
            num = 0
            if nums[j] >= 10:
                string_num = str(nums[j])
                num_array = [x for x in string_num]
                for dig_num in num_array:
                    num += int(dig_num)
                    #print(dig_num)
                digital_sum += num
            else:
                #print(nums[j])
                digital_sum += nums[j]
        
        return abs(sum_val - digital_sum)