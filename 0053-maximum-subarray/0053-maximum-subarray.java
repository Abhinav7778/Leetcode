class Solution {
    public int maxSubArray(int[] nums) {
        int maxS = Integer.MIN_VALUE, s = 0;
        
        for(int i  : nums)
        {
            if(i + s < i)
            {
                s = i;
            }
            else
            {
                s += i;
            }
            maxS = Math.max(maxS, s);
        }
        return maxS;
    }
}