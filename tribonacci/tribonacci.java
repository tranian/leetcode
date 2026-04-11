/**
 * Tribonacci: returns the nth tribonacci number sequence
 * Tribonacci is Tn where T0 = 0, T1 = 1, T2 = 1, Tn+3 = Tn+1 + Tn+2 + Tn for n >= 0
 * 
 * Use a top down approach with memoization
 * */
class Solution {
    int[] arr = new int[38];
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        if (arr[n] != 0) {
            return arr[n];
        }
        arr[n] = tribonacci(n - 3) + tribonacci(n - 2) + tribonacci(n - 1);
        return arr[n];
    }
}
