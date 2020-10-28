class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxProfit = 0
        for i in range(1, len(prices)):
            if prices[i] > prices[i - 1]:
                if prices[i ] - prices[i - 1] > maxProfit :
                    maxProfit = prices[i ] - prices[i - 1]
                prices[i] = prices[i - 1]
            # elif prices[i] < prices[i - 1]:
                # count += prices[i] - prices[i - 1]
        return maxProfit
        