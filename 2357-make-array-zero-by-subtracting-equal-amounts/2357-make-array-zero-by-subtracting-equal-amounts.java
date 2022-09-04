class Solution {
    public int minimumOperations(int[] nums) {
        
        int count = 0;
        
        
        while(isNotZero(nums))
        {
            int min = findMin(nums);
        for(int i = 0; i < nums.length; ++i)
        {
            if(nums[i] != 0)
            nums[i] = nums[i] - min;
        }
            ++count;
        }
        return count;
    }
    

    private boolean isNotZero(int[] nums)
    {
        for(int i = 0; i < nums.length; ++i)
        {
            if(nums[i] != 0)
                return true;
        }
        return false;
    }
    
    private int findMin(int[] nums)
    {
        int min = Integer.MAX_VALUE; 
        for(int i = 0; i < nums.length; ++i)
        {
            if(nums[i] < min && nums[i] != 0)
            {
                min = nums[i];
            }
        }
        return min;
    }
}