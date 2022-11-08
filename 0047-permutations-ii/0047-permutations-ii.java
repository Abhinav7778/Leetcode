class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        helper(res, ans, nums, 0, new boolean[nums.length]);
        
        return res;
    }
    
    public void helper(List<List<Integer>> res, List<Integer> ans, int[] nums, int start, boolean[] used)
    {
        if(ans.size() == nums.length)
            res.add(new ArrayList<>(ans));
        // else
        {
            for(int i = 0; i < nums.length; ++i)
                {
                    if(used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i-1]))continue;
                    used[i] = true;
                    ans.add(nums[i]);
                    helper(res, ans, nums, i + 1, used);
                    used[i] = false;
                    ans.remove(ans.size() - 1);
                }
        }
        

    }
}