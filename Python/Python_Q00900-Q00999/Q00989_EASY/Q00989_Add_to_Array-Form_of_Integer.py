class Solution(object):
    def addToArrayForm(self, num, k):
        """
        :type num: List[int]
        :type k: int
        :rtype: List[int]
        """
        string_num = ""
        for i in range(len(num)):
            string_num += str(num[i])
        num_add = int(string_num) + k
        string_num2 = str(num_add)
        num_array = []
        for j in range(len(string_num2)):
            num_array.append(int(string_num2[j]))
        return num_array
