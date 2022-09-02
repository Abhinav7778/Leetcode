class Solution {
    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m+1][n+1];
        
        for(int i = 0; i < m; ++i)
        {
            Arrays.fill(grid[i], 1);
        }
        
        for(int i = 1; i < m+1; ++i)
        {
            for(int j = 1; j < n+1; ++j)
            {
                grid[i][j] = grid[i][j-1] + grid[i-1][j];
            }
        }
        
        for(int i = 1; i < m+1; ++i)
        {
            for(int j = 1; j < n+1; ++j)
            {
                System.out.print(" "+ grid[i][j]);
            }
            System.out.println();
        }
        return grid[m-1][n-1];
    }
}