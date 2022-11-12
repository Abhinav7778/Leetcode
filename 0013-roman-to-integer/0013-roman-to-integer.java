class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> hm = new HashMap<>();
        
        hm.put("M", 1000);
        hm.put("CM", 900);
        hm.put("D", 500);
        hm.put("CD", 400);
        hm.put("C", 100);
        hm.put("XC", 90);
        hm.put("L", 50);
        hm.put("XL", 40);
        hm.put("X", 10);
        hm.put("IX", 9);
        hm.put("V", 5);
        hm.put("IV", 4);
        hm.put("I", 1);
        
        int res = 0;
        
        for(int i = 0; i < s.length(); ++i)
        {
            if( i + 1 < s.length() && hm.containsKey(s.substring(i, i+2)))
            {
                res += hm.get(s.substring(i, i + 2));
                ++i;
            }
            else
            {
                res = res + hm.get(s.substring(i, i+1));
            }
        }
        
        return res;

    }
}