class Solution(object):
    def judgeCircle(self, moves):
        """
        :type moves: str
        :rtype: bool
        """
        x_counter = 0
        y_counter = 0
        for i in range(len(moves)):
            if moves[i] == "L":
                x_counter += -1
            elif moves[i] == "R":
                x_counter += 1
            elif moves[i] == "U":
                y_counter += 1
            elif moves[i] == "D":
                y_counter += -1
        if x_counter == 0 and y_counter == 0:
            return True
        else:
            return False