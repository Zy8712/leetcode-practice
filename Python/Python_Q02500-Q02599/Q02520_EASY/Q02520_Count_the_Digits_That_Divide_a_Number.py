class Solution(object):
    def countDigits(self, num):
        """
        :type num: int
        :rtype: int
        """
        string_num = str(num)
        num_array = [x for x in string_num]
        counter = 0
        for i in range(len(num_array)):
            if num % int(num_array[i]) == 0:
                counter += 1
        return counter