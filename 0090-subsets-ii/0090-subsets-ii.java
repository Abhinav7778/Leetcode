class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        helper(res, ans, nums, 0);
        
        return res;
    }
    public void helper(List<List<Integer>> res, List<Integer> ans, int[] nums, int start)
    {
        if(!res.contains(ans))
            res.add(new ArrayList<>(ans));
        
        for(int i = start; i < nums.length; ++i)
        {
            ans.add(nums[i]);
            helper(res, ans, nums, i + 1);
            ans.remove(ans.size() - 1);
        }
    }
}