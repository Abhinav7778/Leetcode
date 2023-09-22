class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = -1;
        
        for(int i = nums.length -2; i >=0; --i)
        {
            if(nums[i] < nums[i+1])
            {
                pivot = i;
                break;
            }
        }
        if(pivot != -1)
        {
            for(int i = nums.length -1; i > pivot; --i)
            {
                
                if(nums[i] > nums[pivot])
                {
                    swap(nums, i, pivot);
                    break;
                }
            }
            Arrays.sort(nums, pivot + 1 , nums.length);
                
        }
        else
        {
            Arrays.sort(nums);
        }
        
    }
    public void swap(int[] nums, int pos1, int pos2)
    {
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp;
    }
}