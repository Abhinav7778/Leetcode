class Solution {
    
        public String countAndSay(int n) {
        if(n <= 0) return "-1";
        String result = "1";
        
        for(int i = 1; i < n; i ++) {
            result = build(result);
        }
        return result;
    }
    public String build(String s) {
        
        
        // String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); ++i)
        {
            int count = 1;
            while((i + 1) < s.length() && s.charAt(i) == s.charAt(i + 1))
            {
                ++count;
                ++i;
            }
            if(count > 1)
                sb = sb.append(count).append(s.charAt(i - 1));
            else
                sb = sb.append(1).append(s.charAt(i));
        }
        
        return sb.toString();
    }
}