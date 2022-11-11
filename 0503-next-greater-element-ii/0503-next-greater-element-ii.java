class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] numss = new int[2 * nums.length];
        
        for(int i = 0; i < nums.length; ++i)
        {
            numss[i] = nums[i];
        }
        
        for(int i = nums.length; i < 2* nums.length; ++i)
        {
            numss[i] = nums[i - nums.length];
        }
        
        Stack<Integer> s = new Stack<>();
        
        
        
        int[] res = new int[numss.length];
        
        Arrays.fill(res, -1);
        
        s.push(0);
        
        for(int i = 1; i < numss.length; ++i)
        {
            while(!s.isEmpty() && numss[s.peek()] < numss[i])
            {
                res[s.pop()] = numss[i];
            }
            s.push(i);
        }
        
        int[] ans = new int[res.length/2];
        
        for(int i = 0; i < ans.length; ++i)
        {

                ans[i] = res[i];
        }
        
        return ans;
    }
}