class Solution {
    public int[] sortedSquares(int[] nums) {
        
        /*The crux over here is that the array is already sorted.
We are comparing the first and last elements because after square these have the possibility of being the highest element.
Both the extremes contain the max element (after square ofc), so we are inserting these elements to the last of the new array to make it sorted.*/
        
        int i = 0, j = nums.length - 1;
        
        int[] res = new int[nums.length];
        
        int st = res.length - 1;
        while(i <= j)
        {
            if(Math.abs(nums[i]) > Math.abs(nums[j]))
            {
                res[st] = nums[i] * nums[i];
                ++i;
            }
            else
            {
                res[st] = nums[j] * nums[j];
                --j;
            }
            --st;
        }
        return res;
    }
}