"""
Python version of minClimbingStairs sliding window.
"""
class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        return self.helper(cost)
    
    def helper(self, cost: List[int]) -> int:
        a = cost[0]
        b = cost[1]
        for i in range(2, len(cost)):
            current = min(a, b)
            a = b
            b = cost[i] + current
        return min(a, b)
