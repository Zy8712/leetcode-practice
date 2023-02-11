class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """

        for i in range(len(digits)):
            digits[len(digits)-1-i] += 1
            if digits[len(digits)-1-i] < 10:
                break
            else:
                if len(digits) == i+1:
                    digit_add = [0]
                    digits[len(digits)-1-i] = 1
                    digits.extend(digit_add)
                    continue
                digits[len(digits)-1-i] = 0
        
        return digits