class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length - 1;
        int c = 0;//matrix[0].length - 1;
        
        while(r >= 0 && r < matrix.length && c >=0 && c < matrix[0].length)
        {
            if(target > matrix[r][c])
            {
                ++c;
            }
            else if(target < matrix[r][c])
            {
                --r;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}