class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Arrays.fill(res, 0);
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i < nums.length; ++i)
        {
            if(hm.containsKey(target - nums[i]))
            {
                res[0] = hm.get(target - nums[i]);
                res[1] = i;
                break;
            }
            else
                hm.put(nums[i],i );
        }
        return res;
    }
}