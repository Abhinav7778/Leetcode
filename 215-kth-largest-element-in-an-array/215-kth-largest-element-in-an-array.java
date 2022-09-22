class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        
        int n = 0;
        for(int i = nums.length - 1;  i >= 0; --i)
        {
            ++n;
            if(n == k)
                return nums[i];
        }
        
        return 0;
    }
}