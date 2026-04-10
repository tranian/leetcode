class Solution:
    memo_list = [0] * 31
    def fib(self, n: int) -> int:
        if (n == 0 or n == 1):
            return n
        if (self.memo_list[n] is not 0):
            return self.memo_list[n]
        self.memo_list[n] = self.fib(n - 2) + self.fib(n - 1)
        return self.memo_list[n]
