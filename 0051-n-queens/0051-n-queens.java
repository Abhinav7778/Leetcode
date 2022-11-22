class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        
        // n queens : N*N board
        // initializing the board with "."

        
       char[][] temp = new char[n][n];
        
        for(int i = 0; i < n; ++i)
        {
            for(int j = 0; j < n; ++j)
            {
                temp[i][j] = '.';
            }
        }
        
        helper(res, temp, n, 0);
        
        return res;
    }
    
    public void helper(List<List<String>> res, char[][] ans, int n, int row)
    {
        if(row == n)
        {
            res.add(charToList(ans));
            return;
        }
        
        for(int col = 0; col < n; ++col)
        {
            if(isValid(ans, n, row, col))
            {
                ans[row][col] = 'Q';
                helper(res, ans, n, row + 1);
                ans[row][col] = '.';
            }
        }
    }
    
    public boolean isValid(char[][] ans, int n, int row, int col)
    {
        
        //check if the col had a queen before
        for(int i = 0; i < n; ++i)
        {
            if(ans[i][col] == 'Q')
            {
                return false;
            }
        }
        
        
        //checking diagonal
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; --i, --j)
        {
            if(ans[i][j] == 'Q')
            {
                return false;
            }
        }
        
        
        //checking anti-diagonal
        
        for(int i = row - 1, j = col + 1; i >= 0 && j < n; --i, ++j)
        {
            if(ans[i][j] == 'Q')
                return false;
        }
        
        return true;
        
    }
    
    public List<String> charToList(char[][] ans)
    {
        List<String> res = new ArrayList<>();
        
        for(char[] c : ans)
        {
            res.add(new String(c));
        }
        
        return res;
    }
}