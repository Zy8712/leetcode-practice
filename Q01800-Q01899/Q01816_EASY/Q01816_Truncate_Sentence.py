class Solution(object):
    def truncateSentence(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: str
        """
        counter = 0
        truncated_string = ""
        for i in range(len(s)):
            if s[i] == " ":
                counter += 1
            if counter == k:
                break
            else: 
                truncated_string += s[i]
        return truncated_string