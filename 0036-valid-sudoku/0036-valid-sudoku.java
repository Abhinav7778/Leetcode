class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> hs = new HashSet<>();
        
        for(int i = 0; i < board.length; ++i)
        {
            for(int j = 0; j < board[0].length; ++j)
            {
                char c = board[i][j];
                
                if(c != '.' && ( !hs.add(c + "row"+ i) || !hs.add(c + "col"+j) || !hs.add(c + "row"+i/3 + "col"+j/3)))
                    return false;
            }
        }
        return true;
    }
}