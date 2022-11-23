class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int d12 = findEucDis(p1, p2);
        int d13 = findEucDis(p1, p3);
        int d14 = findEucDis(p1, p4);
        int d23 = findEucDis(p2, p3);
        int d24 = findEucDis(p2, p4);
        int d34 = findEucDis(p3, p4);
        
        // 4 distances for sides and 2 for diagonals, all sides should have equal distances, and both diagonals should also have equal distance, So ideally in a HashSet we should have only 2 distances additionally noone of the 2 should be 0
        
        
        Set<Integer> hs = new HashSet<>(Arrays.asList(d12, d13, d14, d23, d24, d34));
        
        if(!hs.contains(0) && hs.size() == 2)
            return true;
        
        return false;
    }
    
    public int findEucDis(int[] p1, int[] p2)
    {
        // (x2 - x1)^2 + (y2 - y1)^2 
        return ((p2[0] - p1[0]) * (p2[0] - p1[0])) + ((p2[1] - p1[1]) * (p2[1] - p1[1]));
    }
}