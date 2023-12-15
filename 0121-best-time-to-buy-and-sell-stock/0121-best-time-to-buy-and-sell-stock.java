class Solution {
    public int maxProfit(int[] prices) {
        int maxp = 0, minPrice = prices[0];
        
        for(int price : prices)
        {
            if(price < minPrice)
            {
                minPrice = price;
            }
            else
            {
                maxp = Math.max(maxp, price - minPrice);
            }
        }
        return maxp;
    }
}