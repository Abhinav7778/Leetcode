class Solution {
    public int countBinarySubstrings(String s) {
        int currLen = 1, prevLen = 0, count = 0;
        
        for(int i = 1; i < s.length(); ++i)
        {
            if(s.charAt(i) == s.charAt(i-1))
            {
                ++currLen;
            }
            else
            {
                prevLen = currLen;
                currLen = 1;
            }
            if(prevLen >= currLen)++count;
        }
        return count;
    }
}