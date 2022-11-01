class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        
        if(nums.length < 3)
            return res;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; ++i)
        {
            if(i != 0 && nums[i] == nums[i-1])
                continue;
            
            int s = i + 1, e = nums.length - 1;
            
            while(s < e)
            {
                int sum = nums[i] + nums[s] + nums[e];
                
                if(sum == 0)
                {
                    res.add(Arrays.asList(nums[i], nums[s], nums[e]));
                
                    ++s;
                    --e;
                    while(s <= e && nums[e] == nums[e+1])
                        --e;
                    while(s <= e && nums[s] == nums[s-1])
                        ++s;
                }
                else if(sum > 0)
                {
                    --e;
                }
                else
                {
                    ++s;
                }
            }
        }
        return res;
    }
}