"""
Python implementation of top-down house robber
"""
class houseRobber:
    def rob(self, nums: List[int]) -> int:
        self.memo_list = [-1] * 100
        return self.helper(nums, 0);
    
    def helper(self, nums: List[int], pos) -> int:
        if (pos >= len(nums)):
            return 0
        if (self.memo_list[pos] != -1):
            return self.memo_list[pos]
        pick = nums[pos] + self.helper(nums, pos + 2)
        skip = self.helper(nums, pos + 1)
        if (pick > skip):
            self.memo_list[pos] = pick
            return pick
        else:
            self.memo_list[pos] = skip
            return skip
