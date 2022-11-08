class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        
        helper(res, ans, s, 0);
        
        return res;
    }
    
    public void helper(List<List<String>> res, List<String> ans, String s, int index)
    {
        if(index == s.length())
            res.add(new ArrayList<>(ans));
        
        for(int i = index; i < s.length(); ++i)
        {
            if(isPal(s, index, i))
            {
                ans.add(s.substring(index, i + 1));
                helper(res, ans, s, i + 1);
                ans.remove(ans.size() -1);
            }
        }
    }
    public boolean isPal(String s, int st, int e)
    {
        while(st < e)
        {
            if(s.charAt(st) != s.charAt(e))
                return false;
            ++st;
            --e;
        }
        return true;
    }
}