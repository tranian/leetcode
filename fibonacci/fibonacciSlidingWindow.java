/**
 * Alternative way to find fibonacci number using a sliding window
 * arr holds two values: arr[0] is the n-2 fibonacci number, and arr[1] is n-1
 * After solving for n, make arr[1] = n, and arr[0] = arr[1]
 * */
class fibonacciSlidingWindow {
    int arr[] = new int[2];
    public int fib(int n) {
        arr[1] = 1;
        return helper(n);
    }

    public int helper(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        for (int i = 2; i <= n; i++) {
            int sum = arr[0] + arr[1];
            arr[0] = arr[1];
            arr[1] = sum;
        }

        return arr[1];
    }
}
