class Solution {
    public int minCut(String s) {
        int n = s.length();
        
        int[][] dp = new int[n+1][n+1];
        
        for(int i = 0; i < n+1; ++i)
        {
            Arrays.fill(dp[i], -1);
        }
        
        return helper(s, 0, n-1, dp);
    }
    
    private int helper(String s, int i, int j, int[][] dp)
    {
        if(i >=j || isPalindrome(s, i, j))
        {
            //no palindrome part needed
            return 0;
        }

        
        if(dp[i][j] != -1)
        {
            return dp[i][j];
        }
        else
        {
            int min = Integer.MAX_VALUE;
            
            for(int k = i; k <= j-1; ++k)
            {
                if(isPalindrome(s, i, k))
                {
                    int temp = helper(s, i, k, dp) + helper(s, k+1, j, dp) + 1;
                
                    min = Math.min(min, temp);
                }
            }
            return dp[i][j] = min;
        } 
    }
    
    private boolean isPalindrome(String s, int i, int j)
    {
        if(i >= j) return true;
        while(i < j)
        {
            if(s.charAt(i) != s.charAt(j))
                return false; 
            i++;
            j--;
        }
        return true;
    }
}