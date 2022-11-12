class Solution {
    public boolean isAnagram(String s, String t) {
        int[] cs = new int[26];
        int[] ct = new int[26];
        
        for(char c : s.toCharArray())
        {
            cs[c - 'a']++; 
        }
        
        for(char c : t.toCharArray())
        {
            ct[c - 'a']++;
        }
        
        for(int i = 0; i < 26; ++i)
        {
            if(ct[i] != cs[i])
                return false;
        }
        return true;
    }
}