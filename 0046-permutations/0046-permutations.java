class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        
        List<Integer> ans = new ArrayList<>();
        
        helper(res, ans, nums, 0);
        
        return res;
    }
    
    public void helper(List<List<Integer>> res, List<Integer> ans, int[] nums, int start)
    {
        if(ans.size() == nums.length)
            res.add(new ArrayList<>(ans));
        
        for(int i = 0; i < nums.length; ++i)
        {
            if(ans.contains(nums[i]))continue;
            ans.add(nums[i]);
            helper(res, ans, nums, i + 1);
            ans.remove(ans.size() - 1);
        }
    }
}