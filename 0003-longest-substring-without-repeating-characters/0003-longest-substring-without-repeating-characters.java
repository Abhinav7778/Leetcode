class Solution {
    public int lengthOfLongestSubstring(String s) {
        int st = 0, e = 0;
        Set<Character> hs = new HashSet<>();
        int res = 0;
        while( e < s.length())
        {
           while(hs.contains(s.charAt(e))) 
           {
               hs.remove(s.charAt(st));
               ++st;
           }
            res = Math.max(res, e - st + 1);
            hs.add(s.charAt(e));
            ++e;
        }
        return res;
    }
}