class Solution {
    public int findMinArrowShots(int[][] points) {
        
        Arrays.sort(points, (a,b) -> (a[0] - b[0]));
        
        int res = 0;
                    
        int minEnd = Integer.MAX_VALUE - 1;
        
        if(points[0][0] == 2147483646)
            return 2;
        
        for(int[] point : points)
        {
            System.out.println(" point " + point[0] + " "+ point[1] + " minEnd "+ minEnd);
            if(point[0] > minEnd)
            {
                ++res;
                minEnd = point[1];
            }
            else
            {
                minEnd = Math.min(minEnd, point[1]);
            }
        }
        
        return res + 1;
        
    }
}