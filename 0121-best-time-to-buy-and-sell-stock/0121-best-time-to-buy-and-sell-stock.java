class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0, min = Integer.MAX_VALUE;
        
        for(int i = 0; i < prices.length; ++i)
        {
            if(prices[i] < min)
            {
                min = Math.min(min, prices[i]);
            }
            maxP = Math.max(maxP, prices[i] - min);
        }
        return maxP;
    }
}