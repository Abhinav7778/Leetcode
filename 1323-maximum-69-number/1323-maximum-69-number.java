class Solution {
    public int maximum69Number (int num) {
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        String s = sb.toString();
        
        
        sb = new StringBuilder();
        boolean done = false;
        for(char c : s.toCharArray())
        {
            if(c == '6' && !done)
            {
                sb.append('9');
                done = true;
            }
            else
            {
                sb.append(c);
            }
        }
        return Integer.parseInt(String.valueOf(sb.toString()));
    }
}