class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int pw1 = -1, pw2 = -1, e = 0, min = Integer.MAX_VALUE;
        
        while(e < wordsDict.length)
        {
            if(wordsDict[e].equals(word1))
            {
                pw1 = e;
            }
            if(wordsDict[e].equals(word2))
            {
                pw2 = e;
            }
            ++e;
            
            if(pw1 != -1 && pw2 != -1 )
                min = Math.min(min, Math.abs(pw1 - pw2));
        }
        return min;
    }
}