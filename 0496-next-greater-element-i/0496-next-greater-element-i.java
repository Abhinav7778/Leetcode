class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        //run monotic decreasing stack on nums2
        int[] monStack = new int[nums2.length];
        
        Map<Integer, Integer> hm = new HashMap<>();
        
        Stack<Integer> s = new Stack<>();
        
        s.push(0);
        
        for(int i = 1; i < nums2.length; ++i)
        {
            while(!s.isEmpty() && nums2[s.peek()] < nums2[i])
            {
                // monStack[s.pop()] = nums2[i];
                hm.put(nums2[s.pop()], nums2[i]);
            }
            s.push(i);
        }
        
        int[] res = new int[nums1.length];
        
        for(int i = 0; i < nums1.length; ++i)
        {
            
            if(!hm.containsKey(nums1[i]))
                res[i] = -1;
            else
                res[i] = hm.get(nums1[i]);

        }
        
        return res;
    }
}