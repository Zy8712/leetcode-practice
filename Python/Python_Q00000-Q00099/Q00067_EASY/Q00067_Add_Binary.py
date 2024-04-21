class Solution(object):
    def addBinary(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """

        max_length = 0
        if len(a) > len(b):
            max_length = len(a)
        else:
            max_length = len(b)
        
        a_sum = 0
        b_sum = 0
        for i in range(max_length):
            try:
                a_sum += int(a[(i+1)*(-1)]) * pow(2, i)
            except:
                pass

            try:
                b_sum += int(b[(i+1)*(-1)]) * pow(2, i)
            except:
                pass
        
        tot_sum = a_sum + b_sum
        binary_string = ""
        for i in range(max_length, -1, -1):
            if tot_sum >= pow(2, i):
                binary_string += "1"
                tot_sum -= pow(2, i)
            elif i != max_length:
                binary_string += "0"
            
        return binary_string




        