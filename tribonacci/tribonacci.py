"""
Tribonacci top down implementation in python
"""
class Solution:
    memo_list = [0] * 38
    def tribonacci(self, n: int) -> int:
        if (n == 0):
            return 0
        if (n == 1 or n == 2):
            return 1
        if (self.memo_list[n] is not 0):
            return self.memo_list[n]
        self.memo_list[n] = self.tribonacci(n - 3) + self.tribonacci(n - 2) + self.tribonacci(n - 1)
        return self.memo_list[n]
