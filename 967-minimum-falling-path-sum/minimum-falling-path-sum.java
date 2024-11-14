class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int ans = Integer.MAX_VALUE;
        int [][]dp = new int [matrix.length][matrix[0].length];
        for(int[] a : dp){
            Arrays.fill(a , -100000);
        }
        for(int i=0 ; i<matrix[0].length ; i++){
            ans = Math.min(ans , path(matrix , dp , 0 , i));
        }
        return ans;
        
    }

    public int path(int [][]grid , int[][] dp , int cr , int cc){
        if(cc >= grid[0].length || cc<0){
            return Integer.MAX_VALUE;
        }
        if(cr == grid.length-1){
            return grid[cr][cc];
        }
        if(dp[cr][cc] != -100000){
            return dp [cr][cc];
        }
        int ld = path(grid , dp ,cr+1 , cc-1);
        int rd = path(grid , dp , cr+1 , cc+1);
        int d = path(grid , dp ,cr+1 , cc);

        return dp [cr][cc] = Math.min(d , Math.min(ld, rd)) + grid[cr][cc];
    }
}