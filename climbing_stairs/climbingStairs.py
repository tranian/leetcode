class Solution:
    memo_list = [0] * 46
    def climbStairs(self, n: int) -> int:
        return self.recurs(n)

    def recurs(self, remainder):
        if (remainder == 0):
            return 1
        elif (remainder < 0):
            return 0
        if (self.memo_list[remainder] is not 0):
            return self.memo_list[remainder]
        sum = 0
        for i in range(1, 3):
            sum += self.recurs(remainder - i)
        self.memo_list[remainder] = sum
        return sum
        
