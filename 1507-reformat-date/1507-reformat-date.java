class Solution {
    String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    
    public String reformatDate(String date) {
        String[] s = date.split(" ");
        
        String res = s[2];
        int i;
        for( i = 0; i < 12; ++i)
        {
// System.out.println(" month arr "+ month[i] + " actual " + res" equal ? "+ s[2].equals(month[i]));
            if(s[1].equals(month[i]))
                break;
        }
        if((i + 1) < 10)
        {
            res = res + "-" + "0" + String.valueOf(i+1) + "-";
        }
        else
            res = res + "-" + String.valueOf(i+1) + "-";
        
        StringBuilder sb = new StringBuilder();
        for(char c: s[0].toCharArray())
        {
            if(Character.isDigit(c))
                sb.append(c);
            else
                break;
        }
        
        if(sb.length() == 1)
            res = res + "0" + sb.toString();
        else
            res = res + sb.toString();
        
        return res;
        
    }
}