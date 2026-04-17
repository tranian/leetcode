class triangle {
    // int[][] arr;
    public int minimumTotal(List<List<Integer>> triangle) {
        /*
        arr = new int[triangle.size()][triangle.size()];
        for (int[] rows : arr) {
            Arrays.fill(rows, -1);
        }
        return helper(triangle, 0, 0);
        */
        int[][] dp = new int[triangle.size()][triangle.size()];
        for (int j = 0; j < triangle.get(triangle.size() - 1).size(); ++j) {
            dp[triangle.get(triangle.size() - 1).size() - 1][j] = triangle.get(triangle.size()-1).get(j);
        }
        for (int i = triangle.size() - 2; i >= 0; --i) {
            for (int j = 0; j < triangle.get(i).size(); ++j) {
                int left = dp[i+1][j];
                int right = dp[i+1][j+1];
                dp[i][j] = triangle.get(i).get(j) + Math.min(left, right);
            }
        }
        return dp[0][0];
    }
    /*
    public int helper(List<List<Integer>> triangle, int row, int col) {
        if (triangle.size() - 1  == row) {
            return triangle.get(row).get(col);
        }
        if (arr[row][col] != -1) {
            return arr[row][col];
        }
        int left = helper(triangle, row + 1, col);
        int right = helper(triangle, row + 1, col + 1);
        arr[row][col] = triangle.get(row).get(col) + Math.min(left, right);
        return arr[row][col];
    }
    */
}
