class Solution(object):
    def heightChecker(self, heights):
        """
        :type heights: List[int]
        :rtype: int
        """
        expected = list(heights)
        expected.sort()
        counter = 0
        for i in range(len(heights)):
            if heights[i] != expected[i]:
                counter += 1
        return counter