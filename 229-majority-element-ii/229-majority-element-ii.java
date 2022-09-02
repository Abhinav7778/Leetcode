class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        
        Map<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < nums.length; ++i)
        {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        
        for(Map.Entry<Integer, Integer> e : hm.entrySet())
        {
            if(e.getValue() > (nums.length / 3))
            {
                res.add(e.getKey());
            }
        }
        return res;
    }
}