class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        long mod = 1000000007;
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        long maxH = 0, maxV = 0;
        for(int i = 1; i < horizontalCuts.length; ++i)
        {
            if(maxH < (horizontalCuts[i] - horizontalCuts[i-1]))
                maxH = horizontalCuts[i] - horizontalCuts[i-1];
        }
        maxH = Math.max(maxH,h - horizontalCuts[horizontalCuts.length - 1]);
        maxH = Math.max(maxH, horizontalCuts[0]);
        
        for(int i = 1; i < verticalCuts.length; ++i)
        {
            maxV = Math.max(maxV, verticalCuts[i] - verticalCuts[i-1]);
        }
        
        maxV = Math.max(maxV, w - verticalCuts[verticalCuts.length - 1]);
        maxV = Math.max(maxV, verticalCuts[0]);
        
        return (int)(maxV%mod * maxH%mod);
        
    }
}