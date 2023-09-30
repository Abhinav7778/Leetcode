class Solution {
    public int lengthOfLongestSubstring(String s) {
        int st = 0, e = 0, max = 0;
        List<Character> al = new ArrayList<>();
        while(e < s.length())
        {
            if(!al.contains(s.charAt(e)))
            {
                
                al.add(s.charAt(e));
                
                //     for(char ch : al)
                //         System.out.print(" " + ch);
                // System.out.println();
                ++e;
                max = Math.max(max, e - st);
            }
            else
            {
                while(al.contains(s.charAt(e)))
                {
                    // for(char ch : al)
                    //     System.out.print(" " + ch);
                    // System.out.println();
                    ++st;
                    al.remove(0);
                }
            }
        }
        return max;
    }
}