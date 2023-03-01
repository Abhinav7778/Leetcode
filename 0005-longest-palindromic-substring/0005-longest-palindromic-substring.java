class Solution {
    public String longestPalindrome(String s) {
        
        
        String res = "";
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < s.length(); ++i)
        {
            int l1 = fromCenter(i, i, s);
            int l2 = fromCenter(i, i + 1, s);
            
            int l = Math.max(l1, l2);
            
            // System.out.print(" l " + l);
            int st = (i - (l-1)/2);
            // System.out.print(" st " + st);
            
            int e = i + l/2;
            // System.out.print(" e " + e );
            
            if(e - st + 1 > max)
            {
                res = s.substring(st, e + 1);
                max = e - st + 1;
            }
        }
        
        return res;
    }
    
    public int fromCenter(int st, int e, String s)
    {
        // System.out.println(" st char " + s.charAt(st) + " st " + st + " e char "+s.charAt(e) +" e" + e  );
        while(st >= 0 && e < s.length() && s.charAt(st) == s.charAt(e) )
        {
                                // System.out.println(" st char " + s.charAt(st) + " st " + st + " e char "+s.charAt(e) +" e" + e  );

            --st;
            ++e;

        }
        System.out.println();
        return e - st - 1;
    }
}