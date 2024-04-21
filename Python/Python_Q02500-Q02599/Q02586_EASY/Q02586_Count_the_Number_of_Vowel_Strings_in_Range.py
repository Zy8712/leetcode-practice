class Solution(object):
    def vowelStrings(self, words, left, right):
        """
        :type words: List[str]
        :type left: int
        :type right: int
        :rtype: int
        """
        count = 0        
        for word in words[left:right+1]:
            if len(word) >= 2 and word[0] in "aeiou" and word[-1] in "aeiou":
                count += 1
            elif len(word) == 1 and word in "aeiou":
                count += 1
        return count