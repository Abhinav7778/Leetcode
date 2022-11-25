class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        int res = Integer.MIN_VALUE;
        for(int i : nums)
        {
            hs.add(i);
        }
        
        for(int i : hs)
        {
            if(!hs.contains(i-1))
            {
                int j = i + 1;
                while(hs.contains(j))
                {
                    ++j;
                }
                res = Math.max(res, j-i);
            }
        }
        
        return res == Integer.MIN_VALUE ? 0 : res;
    }
}