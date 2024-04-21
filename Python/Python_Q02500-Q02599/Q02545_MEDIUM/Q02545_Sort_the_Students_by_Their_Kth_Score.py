class Solution(object):
    def sortTheStudents(self, score, k):
        """
        :type score: List[List[int]]
        :type k: int
        :rtype: List[List[int]]
        """
        for i in range(len(score)):
            for j in range(i+1, len(score)):
                if score[i][k] < score[j][k]:
                    score[i], score[j] = score[j], score[i]
        return score