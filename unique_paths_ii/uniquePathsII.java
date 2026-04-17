class uniquePathsII {
    // int[][] arr;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        /*
        arr = new int[obstacleGrid.length][obstacleGrid[0].length];
        for (int[] row : arr) {
            Arrays.fill(row, -1);
        }
        return helper(0, 0, obstacleGrid);
       */
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }
        dp[0][0] = 1;
        for (int j = 1; j < obstacleGrid[0].length; ++j) {
            dp[0][j] = (obstacleGrid[0][j] == 0 && dp[0][j - 1] == 1) ? 1 : 0;
        }
        for (int i = 1; i < obstacleGrid.length; ++i) {
            dp[i][0] = (obstacleGrid[i][0] == 0 && dp[i - 1][0] == 1) ? 1 : 0;
        }

        for (int i = 1; i < obstacleGrid.length; ++i) {
            for (int j = 1; j < obstacleGrid[0].length; ++j) {
                if (obstacleGrid[i][j] == 0) {
                    dp[i][j] = dp[i-1][j] + dp[i][j - 1];
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return dp[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }
    /*
    public int helper(int posX, int posY, int[][] obstacleGrid) {
        if (posX == obstacleGrid.length || posY == obstacleGrid[0].length || obstacleGrid[posX][posY] == 1) {
            return 0;
        }
        if (posX == obstacleGrid.length - 1 && posY == obstacleGrid[0].length - 1) {
            return 1;
        }
        if (arr[posX][posY] != -1) {
            return arr[posX][posY];
        }
        arr[posX][posY] = helper(posX + 1, posY, obstacleGrid) + helper(posX, posY + 1, obstacleGrid);
        return arr[posX][posY];
    }
    */
}
