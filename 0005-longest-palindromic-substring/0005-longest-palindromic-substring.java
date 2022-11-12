class Solution {
    public String longestPalindrome(String s) {
        
        int maxl = Integer.MIN_VALUE;
                    int st = 0, e = 0;

        for(int i = 0; i < s.length(); ++i)
        {
            int l1 = fromCenter(s, i, i);
            int l2 = fromCenter(s, i, i + 1);
            
            int l = Math.max(l1, l2);
            
            if( l > maxl)
            {
                st = i - (l-1)/2;
                e = i + l/2;
                maxl = l;
            }
        }
        
        return s.substring(st, e + 1);
        
    }
    public int fromCenter(String s, int st, int e)
    {
        while(st >= 0 && e < s.length() && s.charAt(st) == s.charAt(e))
        {
            --st;
            ++e;
        }
        return e - st - 1;
    }
}