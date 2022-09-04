class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (log1, log2) -> {
            int s1 = log1.indexOf(" ");
            String l1 = log1.substring(0, s1);
            String m1 = log1.substring(s1 + 1);
            
            int s2 = log2.indexOf(" ");
            String l2 = log2.substring(0, s2);
            String m2 = log2.substring(s2 + 1);
            
            boolean isDigit1 = Character.isDigit(m1.charAt(0));
            boolean isDigit2 = Character.isDigit(m2.charAt(0));
            
            if(!isDigit1 && !isDigit2)
            {
                int val = m1.compareTo(m2);
                
                if(val == 0)
                {
                    return l1.compareTo(l2);
                }
                return val;
            }
            
            return isDigit1 ? (isDigit2 ? 0 : 1) : -1;
        }); 
        return logs;
    }
}