class KthLargest {

    int k;
    int[] nums;
    
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = nums;
    }
    
    public int add(int val) {
        int[] nn = new int[nums.length + 1];
        
        int c = 0;
        for(int i : nums)
        {
            nn[c] = i;
            ++c;
        }
        nn[nn.length - 1] = val;
        
        Arrays.sort(nn);
        
        nums = nn;
        
//         System.out.println("Sorted ");
        
//         for(int i : nn)
//         {
//             System.out.println(" i "+ i);
//         }
        
        int reached = 1;
        for(int i = nn.length - 1; i >= 0; --i)
        {
            if(reached == k)
            {
                return nn[i];
            }
            ++reached;
        }
        return -1;
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */