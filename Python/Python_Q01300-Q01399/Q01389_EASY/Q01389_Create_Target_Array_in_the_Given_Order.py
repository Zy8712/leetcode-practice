class Solution(object):
    def createTargetArray(self, nums, index):
        """
        :type nums: List[int]
        :type index: List[int]
        :rtype: List[int]
        """
        output_list = []
        for i in range(len(index)):
            output_list.insert(index[i], nums[i])
        return output_list
