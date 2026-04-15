/**
 * deleteAndEarn: use the houseRobber algorithm, do precomputing to create a new
 * array of frequencies of each value
 * */
class deleteAndEarn {
    int[] memo = new int[10001];
    public int deleteAndEarn(int[] nums) {
        Arrays.fill(memo, -1);
        int[] arr = new int[10001];
        arr[nums[0]] = nums[0];
        int temp = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] != temp) {
                temp = nums[i];
            }
            arr[temp] += nums[i];
        }
        return helper(arr, 0);
    }
    public int helper(int[] nums, int pos) {
        if (pos >= nums.length) {
            return 0;
        }
        if (memo[pos] != -1) {
            return memo[pos];
        }
        int pick = nums[pos] + helper(nums, pos + 2);
        int skip = helper(nums, pos + 1);
        if (pick > skip) {
            memo[pos] = pick;
            return pick;
        } else {
            memo[pos] = skip;
            return skip;
        }
    }
}
