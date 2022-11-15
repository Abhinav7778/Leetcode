class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        
        Arrays.sort(words, (a,b) -> a.length() - b.length());
        
        // Set<String> hs = new HashSet<>(Arrays.asList(words));
        
        List<String> res = new ArrayList<>();
        
        Set<String> prevWords = new HashSet<>();
        
        for(String s : words)
        {
            if(isConcat(s, prevWords))
                res.add(s);
            prevWords.add(s);
        }
        return res;
    }
    
    public boolean isConcat(String s, Set<String> hs)
    {
        boolean[] dp = new boolean[s.length() + 1];
        
        Arrays.fill(dp, false);
        
        dp[0] = true;
        
        for(int i = 1; i <= s.length(); ++i)
        {
            for(int j = 0; j < i; ++j)
            {
                if(dp[j] && hs.contains(s.substring(j, i)))
                    dp[i] = true;
            }
        }
        return dp[s.length()];
    }
}