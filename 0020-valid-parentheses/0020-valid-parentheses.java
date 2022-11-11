class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        Map<Character, Character> hm = new HashMap<>();
        hm.put('(', ')');
        hm.put('{', '}');
        hm.put('[' , ']');
        int i = 0;
        while(i < s.length())
        {
            char c = s.charAt(i);
            if(!st.isEmpty() && (c == '}' || c == ']' || c == ')') && hm.containsKey(st.peek()) && hm.get(st.peek()) == c)
            {
                st.pop();
            }
            else
            {
                st.push(c);
            }
            ++i;
        }
        return st.isEmpty();
    }
}