class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = -1;
        
        for(int i = nums.length - 2; i >= 0; --i)
        {
            // System.out.println(" nums[i] " + nums[i] + " nums[i+1] " + nums[i+1] + " i " + i);
            if(nums[i] < nums[i+1])
            {
                pivot = i;
                break;
            }
        }
        
        // System.out.println(" pivot " + pivot);
        
        if(pivot == -1)
        {
            Arrays.sort(nums);
        }
        else
        {
            for(int i = nums.length - 1; i >= 0; --i)
            {
                if(nums[i] > nums[pivot])
                {
                    System.out.println(" pivot " + pivot);
                    swap(nums, i, pivot);
                    break;
                // for(int d : nums)
                //     System.out.print(" "+d);
                }
            }
            Arrays.sort(nums, pivot + 1, nums.length);
        }

    }
    public void swap(int[] nums, int pos1, int pos2)
    {
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp;
    }
}