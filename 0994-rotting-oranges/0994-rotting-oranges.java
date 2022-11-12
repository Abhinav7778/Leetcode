class Solution {
    public int orangesRotting(int[][] grid) {
        
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < grid.length; ++i)
        {
            for(int j = 0; j < grid[0].length; ++j)
            {
                if(grid[i][j] == 2)
                {
                    dfs(i, j, grid, 2);
                }
                    
            }
        }
        
        for(int i = 0; i < grid.length; ++i)
        {
            for(int j = 0; j < grid[0].length; ++j)
            {
                if(grid[i][j] == 1)
                    return -1;
                max = Math.max(max, grid[i][j]);
            }
        }
        return max - 2  <= 0 ? 0 : max - 2;
    }
    
    public void dfs(int i, int j, int[][] grid, int minute)
    {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0)
            return;
        
        
        if(grid[i][j] > 1 && grid[i][j] < minute)
            return;
        
        
        grid[i][j] = minute;
        
        ++minute;
        
        dfs(i+1, j, grid, minute);
        dfs(i, j+1, grid, minute);
        dfs(i, j-1, grid, minute);
        dfs(i-1, j, grid, minute);
    }
}