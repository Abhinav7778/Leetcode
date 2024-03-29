class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        LinkedList<int[]> res = new LinkedList<>();
        
        for(int[] interval : intervals)
        {
            if(!res.isEmpty() && res.getLast()[1] >= interval[0])
            {
                res.getLast()[1] = Math.max(res.getLast()[1], interval[1]);
            }
            else
            {
                res.add(interval);
            }
        }
        return res.toArray(new int[res.size()][2]);
    }
}