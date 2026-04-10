class Solution:
    memo_list = [0] * 2
    def fib(self, n: int) -> int:
        self.memo_list[0] = 0
        self.memo_list[1] = 1

        if (n == 0 or n == 1):
            return n
        for i in range(2, n + 1):
            sum = self.memo_list[0] + self.memo_list[1]
            self.memo_list[0] = self.memo_list[1]
            self.memo_list[1] = sum
        return self.memo_list[1]
        
