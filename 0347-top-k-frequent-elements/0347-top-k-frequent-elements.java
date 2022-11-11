class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        
        for(int i : nums)
        {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        
        Queue<Integer> pq = new PriorityQueue<>((n1, n2) -> hm.get(n2) - hm.get(n1));
        
        for(int i : hm.keySet())
        {
            pq.add(i);
        }
        
        int[] res = new int[k];
        int i = 0;
        while(i < k)
        {
            res[i] = pq.poll();
            ++i;
        }
        
        return res;
    }
}