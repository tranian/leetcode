/**
 * A better way is to do a sliding window technique as it's a fibonacci sequence
 * change the base case to match when n = 0 and n = 1
 * */
class climbingStairsFibonacci {
    int arr[] = new int[2];
    public int climbStairs(int n) {
        arr[1] = 1;
        arr[0] = 1;
        return helper(n);
    }

    public int helper(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        for (int i = 2; i <= n; ++i) {
            int sum = arr[0] + arr[1];
            arr[0] = arr[1];
            arr[1] = sum;
        }

        return arr[1];
    }
}
