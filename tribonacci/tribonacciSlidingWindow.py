"""
Tribonacci sliding window implementation in python
"""
class Solution:
    memo_list = [0] * 3
    def tribonacci(self, n: int) -> int:
        self.memo_list[0] = 0
        self.memo_list[1] = 1
        self.memo_list[2] = 1
        if (n == 0):
            return 0
        if (n == 1 or n == 2):
            return 1
        for i in range(3, n + 1):
            sum = self.memo_list[0] + self.memo_list[1] + self.memo_list[2]
            self.memo_list[0] = self.memo_list[1]
            self.memo_list[1] = self.memo_list[2]
            self.memo_list[2] = sum
        return sum
