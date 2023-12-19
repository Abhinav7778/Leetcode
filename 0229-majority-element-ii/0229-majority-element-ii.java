class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int i : nums)
        {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        
        for(int i : hm.keySet())
        {
            if(hm.get(i) > nums.length/3)
                res.add(i);
        }
        return res;
    }
}