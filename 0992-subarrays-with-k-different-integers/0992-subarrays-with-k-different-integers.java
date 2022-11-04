class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return subarrayWithAtmostkDistinct(nums, k) - subarrayWithAtmostkDistinct(nums, k-1);
    }
    public int subarrayWithAtmostkDistinct(int[] nums, int k)
    {
        int res = 0, left = 0, right = 0;
        
        Map<Integer, Integer> hm = new HashMap<>();
        
        while(right < nums.length)
        {
            hm.put(nums[right], hm.getOrDefault(nums[right], 0) + 1);
            
            while(hm.size() > k)
            {
                hm.put(nums[left], hm.get(nums[left]) - 1);
                
                if(hm.get(nums[left]) == 0)
                    hm.remove(nums[left]);
                
                ++left;
            }
            res+=(right - left + 1);
            ++right;
        }
        return res;
    }
}