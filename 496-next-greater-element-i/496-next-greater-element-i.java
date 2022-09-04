class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Map<Integer, Integer> hm = new HashMap<>();
        
        Stack<Integer> s = new Stack<>();
        int[] finalRes = new int[nums1.length];
        
        
        for(int i = 0; i < nums2.length; ++i)
        {
            while(!s.isEmpty() && nums2[s.peek()] < nums2[i])
            {
                hm.put(nums2[s.peek()], nums2[i]);
                // System.out.println(" "+ nums[s.peek() + " "+ nums2[i]);
                s.pop();
            }
            s.push(i);
        }
        
        for(int i = 0; i < nums1.length; ++i)
        {
                finalRes[i] = hm.getOrDefault(nums1[i], -1);
        }
        
        return finalRes;
    }
}