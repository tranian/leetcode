/**
 * Tribonacci using sliding window
 * */
class Solution {
    int[] arr = new int[3];
    public int tribonacci(int n) {
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        for (int i = 3; i <= n; ++i) {
            int sum = arr[0] + arr[1] + arr[2];
            arr[0] = arr[1];
            arr[1] = arr[2];
            arr[2] = sum;
        }
        return arr[2];
    }
}
