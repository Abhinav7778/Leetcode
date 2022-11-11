class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> q = new PriorityQueue<>((a,b) -> b - a);
        
        for(int i : nums)
        {
            q.add(i);
        }
        
        int i = 0, res = 0;
        while(i < k)
        {
            res = q.remove();
            ++i;
        }
        
        return res;
    }
}