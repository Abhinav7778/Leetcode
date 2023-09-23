class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));
        LinkedList<int[]> al = new LinkedList<>();
        
        for(int[] i : intervals)
        {
            if(!al.isEmpty() && al.getLast()[1] >= i[0])
            {
                al.getLast()[1] = Math.max(al.getLast()[1], i[1]);
            }
            else
            {
                al.add(i);
            }
        }
        return al.toArray(new int[al.size()][2]);
    }
}