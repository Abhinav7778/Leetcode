class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hs = new HashSet<>();
        int st = 0, e = 0, max= 0;
        while(e < s.length())
        {
            while(hs.contains(s.charAt(e)))
            {
                hs.remove(s.charAt(st));
                ++st;
            }
            hs.add(s.charAt(e));
            ++e;
            max= Math.max(max, e - st);
        }
        return max;
    }
}