class Solution {
    public void sortColors(int[] nums) {
        int zero = 0, two = nums.length -1,  i = 0;
        
        while(i <= two)
        {
            
            System.out.println(" xero " + zero + " two " + two  + "  i " + i);
            for(int j : nums)
            {
                System.out.print(" " + j);
            }
            System.out.println();
            if(nums[i] == 0)
            {
                nums[i] = nums[zero];
                nums[zero] = 0;
                ++zero;
                ++i;
            }
            else if(nums[i] == 1)
            {
                ++i;
            }
            else
            {
                nums[i] = nums[two];
                nums[two] = 2;
                --two;
                // ++i;
            }
        }
    }
}