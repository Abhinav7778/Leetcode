class Solution {
    public void sortColors(int[] nums) {
        int z = 0, t = nums.length - 1, p = 0;
        
        while(p <= t)
        {
            if(nums[p] == 0)
            {
                nums[p] = nums[z];
                nums[z] = 0;
                ++z;
                ++p;
            }
            else if(nums[p] == 1)
            {
                ++p;
            }
            else 
            {
                nums[p] = nums[t];
                nums[t] = 2;
                --t;
            }
        }
    }
}