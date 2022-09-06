class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] res = new int[26];
        
        char[] ransom = ransomNote.toCharArray();
        for(char c : ransom)
        {
            ++res[c-'a'];
        }
        char[] mag = magazine.toCharArray();
        for(char c : mag)
        {
            if(res[c-'a'] > 0)
            {
                --res[c-'a'];
            }
        }
        for(int i : res)
        {
            if(i != 0)return false;
        }
        return true;
    }
}