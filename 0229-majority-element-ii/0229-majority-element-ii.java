class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < n; ++i)
        {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer> res = new ArrayList<>();
        
        for(int k : hm.keySet())
        {
            if(hm.get(k) > n/3)
                res.add(k);
        }
        
        return res;
    }
}