class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        
        for(int i : nums)
        {
            if(!hs.contains(i))
                hs.add(i);
            else
                return i;
        }
        return -1;
    }
}