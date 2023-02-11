class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        letter_char = "a"
        counter = 0
        s = s.strip()
        for i in range(len(s)):
            letter_char = s[(i+1)*(-1)]
            if letter_char == " ":
                return counter
            counter += 1
            
        return counter

            