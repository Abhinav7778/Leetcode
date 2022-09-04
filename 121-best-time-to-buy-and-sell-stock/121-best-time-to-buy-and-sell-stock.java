class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int maxP = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < prices.length; ++i)
        {

            if(min > prices[i] || i == 0)
            {
                min = Math.min(prices[i], min);
            }
            else
            {
                profit = prices[i] - min;
                
                maxP = Math.max(maxP, profit);
            }
        }
        return maxP == Integer.MIN_VALUE ? 0 : maxP;
    }
}