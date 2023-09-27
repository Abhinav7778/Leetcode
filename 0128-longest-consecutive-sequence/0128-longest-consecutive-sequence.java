class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for(int i : nums)
            hs.add(i);
        
        int max = 0;
        for(int i : nums)
        {
            int temp = i, count = 1;
            // System.out.print( " i " + i);
            while(hs.contains(temp - 1) && !hs.contains(i+1))
            {
                // System.out.print(" Inside ");
                --temp;
                ++count;
            }
            // System.out.println();
            max = Math.max(max, count);
        }
        return max;
        
    }
}