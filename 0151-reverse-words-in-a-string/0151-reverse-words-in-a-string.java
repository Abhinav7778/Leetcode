class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        List<String> al = new ArrayList<>(Arrays.asList(s.split("\s+")));
        String res = "";
        for(int i = al.size() -1; i >= 0; --i)
        {
            if( i != 0)
                res = res + al.get(i) + " ";
            else
                res = res + al.get(i);
        }
        return res;
    }
}