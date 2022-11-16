class Solution {
    public boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        
                if(sum % 2 != 0)
            return false;
        
        sum = sum/2;
        

        
        // System.out.println(" sum "+ sum);
        int n = nums.length;
        
        boolean[][] dp = new boolean[n + 1][sum + 1];
        
        for(int i = 0; i < n + 1;  ++i)
        {
            for(int j = 0; j < sum + 1; ++j)
            {
                if(i == 0)
                    dp[i][j] = false;
                if(j == 0)
                    dp[i][j] = true;
            }
        }
        
        dp[0][0] = true;
        
        for(int i = 1; i < n + 1; ++i)
        {
            for(int j = 1; j < sum + 1; ++j)
            {
                if(nums[i -1] <= j)
                {
                    dp[i][j] = dp[i-1][j] || dp[i-1][j - nums[i-1]];
                }
                else
                {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        
        return dp[n][sum];
    }
}