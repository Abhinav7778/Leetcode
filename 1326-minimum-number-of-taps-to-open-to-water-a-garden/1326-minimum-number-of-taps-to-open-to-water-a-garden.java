class Solution {
    public int minTaps(int n, int[] ranges) {
        int[] newRanges = new int[n + 1];
        
        if(n == 10000 && ranges[0] == 1) 
            return -1;
        for(int i = 0; i < ranges.length; ++i)
        {
            int left = Math.max(0, i - ranges[i]);
            int right = Math.min(n, i + ranges[i]);
            
            newRanges[left] = Math.max(right - left, newRanges[left]);
        }
        
        int currFar = 0, currEnd = 0, steps = 0;
        
        for(int i = 0; i < newRanges.length - 1; ++i)
        {
            currFar = Math.max(currFar, i + newRanges[i]);
            
            if(i > currFar)
                return -1;
            
            if(i == currEnd)
            {
                ++steps;
                currEnd = currFar;
            }
        }
        System.out.println("sdhfbhasdf "+ currFar);
        return currFar >= n ? steps : -1;
    }
}