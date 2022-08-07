class Solution {
    public int minScoreTriangulation(int[] values) {
        //MCM
        int n = values.length;
        
        int[][] dp = new int[n+1][n+1];
        
        for(int i = 0; i < n+1; ++i)
        {
            Arrays.fill(dp[i], -1);
        }
        
        
        return helper(values, 1, values.length - 1, dp);
    }
    
    private int helper(int[] arr, int i, int j, int[][] dp)
    {
        if(i >= j)return 0;
        
        int minCost = Integer.MAX_VALUE;
        
        if(dp[i][j] != -1)
        {
            return dp[i][j];
        }
        else
        {
            for(int k = i; k <= j-1; ++k)
            {
                int tempCost = helper(arr, i, k, dp) + helper(arr, k+1, j, dp) + (arr[i-1] * arr[k] * arr[j]);
            
                minCost = Math.min(minCost, tempCost);
            }
            return dp[i][j] = minCost;
        }
    }
}