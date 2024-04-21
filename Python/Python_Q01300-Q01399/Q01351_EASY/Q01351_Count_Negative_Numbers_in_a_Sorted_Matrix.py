class Solution(object):
    def countNegatives(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        counter = 0
        for i in range(len(grid)):
            for j in range(len(grid[i])):
                x = (j+1) * -1
                if grid[i][x] < 0:
                    counter += 1
                else:
                    break
        return counter