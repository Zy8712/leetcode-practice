class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        minValue = 1e9
        profit = 0
        for i in range(len(prices)):
            minValue = min(minValue, prices[i])
            profit = max(profit, prices[i]-minValue)
        return profit
