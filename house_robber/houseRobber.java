/**
 * HouseRobber - given an array of house values, get the max value from robbing.  Cannot rob houses
 * that are adjacent to each other.
 *
 * Top down approach, using memoization.  Array default set to -1 as 0 is a possible reward.
 * Base case: if reach the end of the array, return 0.
 * At each step, decide to choose to rob this house (pick) or not (skip).
 * */
class HouseRobber {
    int[] arr = new int[100];
    public int rob(int[] nums) {
        Arrays.fill(arr, -1);
        return helper(nums, 0);
    }
    public int helper(int[] nums, int pos) {
        if (pos >= nums.length) {
            return 0;
        }
        if (arr[pos] != -1) {
            return arr[pos];
        }
        int pick = nums[pos] + helper(nums, pos + 2);
        int skip = helper(nums, pos + 1);
        if (pick > skip) {
            arr[pos] = pick;
            return pick;
        } else {
            arr[pos] = skip;
            return skip;
        }
    }
}
