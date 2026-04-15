class deleteAndEarnSlidingWindow {
    int[] memo = new int[10001];
    public int deleteAndEarn(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
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

        int valueBeforeBeforePrev = arr[0];
        int valueBeforePrev = arr[0] > arr[1]? arr[0]: arr[1];
        for (int i = 2; i < arr.length; ++i) {
            temp = valueBeforeBeforePrev + arr[i];
            if (temp < valueBeforePrev) {
                temp = valueBeforePrev;
            }
            valueBeforeBeforePrev = valueBeforePrev;
            valueBeforePrev = temp;
        }
        return valueBeforePrev > valueBeforeBeforePrev? valueBeforePrev: valueBeforeBeforePrev;

        // return helper(arr, 0);
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
