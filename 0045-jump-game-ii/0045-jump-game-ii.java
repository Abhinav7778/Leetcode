class Solution {
    public int jump(int[] nums) {
        int currFurthest = 0, steps = 0;
        int currEnd = 0;
        for(int i = 0; i < nums.length - 1; ++i)
        {
            
            currFurthest = Math.max(currFurthest, i + nums[i]);
            
            if(i == currEnd)
            {
                ++steps;
                currEnd = currFurthest;
            }
        }
        return steps;
    }
}