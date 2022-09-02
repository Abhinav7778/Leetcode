class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //BRUTR FORCE
        
        int m = matrix.length;
        int n = matrix[0].length;
        int[] oneD = new int[m*n];
        
        int c = -1;
        
        for(int i = 0; i < m; ++i)
        {
            for(int j = 0; j < n; ++j)
            {
                oneD[++c] = matrix[i][j];
            }
        }
        
        int s = 0, e = m*n-1, mid = 0, midV = 0;
        
        while(s <= e)
        {
            mid = (s+e)/2;
            
            midV = oneD[mid];
            
            if(midV == target)return true;
            if(midV > target)
            {
                e = mid - 1;
            }
            if(midV < target)
            {
                s = mid + 1;
            }
        }
        return false;
    }
}