class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> res = new ArrayList<>();
        
        helper(0, target, candidates, res, new ArrayList<>());
        
        return res;
    }
    public void helper(int index, int target, int[] c, List<List<Integer>> res, List<Integer> temp)
    {
        if(index == c.length)
        {
            if(target == 0)
                res.add(new ArrayList<>(temp));
            return;
        }

        
        if(target >= c[index])
        {
            temp.add(c[index]);
            helper(index, target - c[index], c, res, temp);
            temp.remove(temp.size() - 1);
        }
        
        helper(index + 1, target, c, res, temp);
        
    }
}