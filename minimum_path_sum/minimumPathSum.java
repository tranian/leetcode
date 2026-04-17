class minimumPathSum {
    // int[][] arr = new int[201][201];
    public int minPathSum(int[][] grid) {
        /*
        for (int[] rows : arr) {
            Arrays.fill(rows, -1);
        }
        */
        int[][] dp = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[i].length; ++j) {
                if (i == 0 && j == 0) {
                        dp[i][j] = grid[i][j];
                } else {
                    int right = (i > 0) ? dp[i-1][j] : Integer.MAX_VALUE;
                    int down = (j > 0) ? dp[i][j - 1] : Integer.MAX_VALUE;
                    dp[i][j] = grid[i][j] + Math.min(right, down);
                }

            }
        }
        return dp[grid.length - 1][grid[0].length - 1];
        // return helper(grid, 0, 0);
    }
/*
    public int helper(int[][] grid, int posX, int posY) {
        if (posX == grid.length - 1 && posY == grid[0].length - 1) {
            return grid[posX][posY];
        }
        if (posX == grid.length || posY == grid[0].length) {
            return Integer.MAX_VALUE / 2;
        }
        if (arr[posX][posY] != -1) {
            return arr[posX][posY];
        }
        int right = helper(grid, posX + 1, posY);
        int down = helper(grid, posX, posY + 1);
        arr[posX][posY] = grid[posX][posY] + Math.min(right, down);
        return arr[posX][posY];
    }
    */

}
