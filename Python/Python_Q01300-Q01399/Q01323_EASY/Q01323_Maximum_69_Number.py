class Solution(object):
    def maximum69Number (self, num):
        """
        :type num: int
        :rtype: int
        """
        num_string = str(num)
        new_string = num_string.replace("6", "9", 1)
        return int(new_string)        
        