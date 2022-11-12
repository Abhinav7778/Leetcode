class Solution {
    public int strStr(String haystack, String needle) {
        int nl = needle.length();
        
        for(int i = 0; i < haystack.length(); ++i)
        {
            if(haystack.length() - i < nl)
                return -1;
            if(haystack.substring(i, i + nl).equals(needle))
                return i;
        }
        return -1;
    }
}