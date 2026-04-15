class uniquePathsTopDown {
    int[][] arr = new int[100][100];
    public int uniquePaths(int m, int n) {
        for (int[] rows : arr) {
            Arrays.fill(rows, -1);
        }
        return helper(0, 0, m, n);
    }

    public int helper(int posX, int posY, int m, int n) {
        if (posX == m - 1 && posY == n - 1) {
            return 1;
        }
        if (posX > m || posY > n) {
            return 0;
        }
        if (arr[posX][posY] != -1) {
            return arr[posX][posY];
        }
        arr[posX][posY] = helper(posX + 1, posY, m, n) + helper(posX, posY + 1, m, n);
        return arr[posX][posY];
    }
}
