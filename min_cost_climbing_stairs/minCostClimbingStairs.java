/**
 * MinCostClimbingStairs, given an array cost where cost[i] is the cost of the ith step, find the
 * way through the array with the least cost, with the ability to progress i+1 or i+2 each turn.
 *
 * Solution is done with a sliding window, with arr[2], where arr[0] represents n - 2 and arr[1]
 * represents n - 1.  Each step the best cost is calculated.
 * */
class Solution {
    int arr[] = new int[2];
    public int minCostClimbingStairs(int[] cost) {
        arr[0] = cost[0];
        arr[1] = cost[1];
        return helper(cost);
    }

    public int helper(int[] cost) {
        
        for (int n = 2; n < cost.length; ++n) {
            int current = 0;
            if (arr[1] > arr[0]) {
                current = arr[0];
            } else {
                current = arr[1];
            }
            arr[0] = arr[1];
            arr[1] = cost[n] + current;
        }

        if (arr[0] < arr[1]) {
            return arr[0];
        } else {
            return arr[1];
        }
    }
}
