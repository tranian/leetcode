/**
 * returns the fibonacci nth number
 * this implementation uses a topdown approach
 * base case: n = 0 return 0, n = 1 returns 1
 * To avoid redundant calculations, answers are cached in arr, where arr[n] gives the nth
 * fibonacci number
 * */
class fibonacci {
    int arr[] = new int[31];
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        if (arr[n] != 0) {
            return arr[n];
        }
        arr[n] = fib(n - 2) + fib(n - 1);
        return arr[n];
    }
}
