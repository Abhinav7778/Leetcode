class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        int[][] vis = new int[m][n];
        
        int res = 0;
        for(int i = 0; i < m; ++i)
        {
            for(int j = 0; j < n; ++j)
            {
                if(grid[i][j] == '1' && vis[i][j] == 0)
                {
                    ++res;
                    dfs(grid, vis, i, j);
                }
            }
        }
        return res;
    }
    
    public void dfs(char[][] grid, int[][] vis, int row, int col)
    {
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || vis[row][col] == 1 || grid[row][col] == '0')
            return;
        
        vis[row][col] = 1;
        
        dfs(grid, vis, row + 1, col);
        dfs(grid, vis, row, col + 1);
        dfs(grid, vis, row - 1, col);
        dfs(grid, vis, row, col - 1);
        
        // vis[row][col] = 0;
    }
}