class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, maxP = 0;
        for(int i = 0; i < prices.length; ++i)
        {
            min = Math.min(min, prices[i]);
            
            if(prices[i] < min)
            {
                min = prices[i];
            }
            else
            {
                maxP = Math.max(maxP, prices[i] - min);
            }
        }
        return maxP;
    }
}