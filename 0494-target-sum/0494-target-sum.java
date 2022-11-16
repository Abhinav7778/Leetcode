class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        int sum = Arrays.stream(nums).sum();
        
        if(target > sum || target + sum < 0 || (target + sum )%2 != 0)
            return 0;
        
        sum = (target + sum) / 2;
        
        int n = nums.length;
        
        int[][] dp = new int[n + 1][sum + 1];
        
        
        for(int i = 0; i < n + 1; ++i)
        {
            for(int j = 0; j < sum + 1; ++j)
            {
                if(i == 0)
                    dp[i][j] = 0;
                if(j == 0)
                    dp[i][j] = 1;
            } 
        }
        
        
        for(int i = 1; i < n + 1; ++i)
        {
            for(int j = 0; j < sum + 1; ++j)
            {
                if(nums[i-1] <= j)
                {
                    dp[i][j] = dp[i-1][j] + dp[i-1][j - nums[i - 1]];
                }
                else
                {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        
        return dp[n][sum];
    }
}