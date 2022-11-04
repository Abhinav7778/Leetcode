class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] entireTrip = new int[10000];
        
        for(int[] trip : trips)
        {
            entireTrip[trip[1]] += trip[0];
            entireTrip[trip[2]] -= trip[0];
        }
        
        for(int passenger : entireTrip)
        {
            capacity-= passenger;
            if(capacity < 0)
                return false;
        }
        return true;
    }
}