class Solution {
    public int compress(char[] chars) {
        int count = 1;
        
        if(chars.length == 1)
            return 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < chars.length; ++i)
        {
            // System.out.println(" i "+ chars[i] + " i-1 "+chars[i-1]);
            if(chars[i] == chars[i-1])
            {
                ++count;
            }
            else
            {
                // System.out.println(" count" + count);
                if(count == 1)
                {
                    sb.append(chars[i-1]);
                }
                else
                {
                    sb.append(chars[i-1]);
                    sb.append(count);
                }
                count = 1;
            }
        }
        if(count != 1)
        {
            sb.append(chars[chars.length -1]);
            sb.append(count);
        }
        else
        {
            sb.append(chars[chars.length - 1]);
        }
        String s = sb.toString();
        
        System.out.println(" string is "+ s);
        
        int i = 0;
        for(char c : s.toCharArray())
        {
            chars[i] = c;
            ++i;
        }
        
        return sb.toString().length();
    }
}