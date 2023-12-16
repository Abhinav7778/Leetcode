class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length - 1, c = 0;
        
        while(r >= 0 && c < matrix[0].length)
        {
            if(target == matrix[r][c])
                return true;
            else if(target > matrix[r][c])
            {
                ++c;
            }
            else
            {
                --r;
            }
        }
        return false;
    }
}