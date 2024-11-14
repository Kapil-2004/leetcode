class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int ans = Integer.MAX_VALUE;
        int[][] dp = new int[matrix.length][matrix[0].length];
        
        for (int[] row : dp) {
            Arrays.fill(row, -100000);
        }

        for (int i = 0; i < matrix[0].length; i++) {
            ans = Math.min(ans, path(matrix, dp, 0, i));
        }
        return ans;
    }

    public int path(int[][] grid, int[][] dp, int cr, int cc) {
        if (cr == grid.length - 1) {
            return grid[cr][cc];
        }
        
        if (dp[cr][cc] != -100000) {
            return dp[cr][cc];
        }

        int ans = Integer.MAX_VALUE;
        for (int col=0 ; col<grid[0].length ; col++) {
            if (col != cc) {
                ans = Math.min(ans, path(grid, dp, cr + 1, col));
            }
        }
        
        ans += grid[cr][cc];
        return dp[cr][cc] = ans;
    }
}
