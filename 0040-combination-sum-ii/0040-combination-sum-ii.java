class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        helper(res, ans, nums, target, 0);
        
        return res;
    }
    
    public void helper(List<List<Integer>> res, List<Integer> ans, int[] nums, int target, int index)
    {
        if(target < 0)
            return;
        if(target == 0)
            res.add(new ArrayList<>(ans));
        
        for(int i = index; i < nums.length; ++i)
        {
            if(i > index && nums[i-1] == nums[i])
                continue;
            ans.add(nums[i]);
            helper(res, ans, nums, target - nums[i], i + 1);
            ans.remove(ans.size() - 1);
        }
    }
}