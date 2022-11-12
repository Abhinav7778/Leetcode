class Solution {
    public int compareVersion(String version1, String version2) {
        
        List<Integer> v1 = new ArrayList<>();
        List<Integer> v2 = new ArrayList<>();
        
        String n = "";
        for(int i = 0; i < version1.length(); ++i)
        {
            if(version1.charAt(i) == '.')
            {
                v1.add(Integer.parseInt(n));
                n = "";
            }
            else
            {
                n = n + version1.charAt(i);
            }
        }
        v1.add(Integer.parseInt(n));
        n = "";
        for(int i = 0; i < version2.length(); ++i)
        {
            if(version2.charAt(i) == '.')
            {
                v2.add(Integer.parseInt(n));
                n = "";
            }
            else
            {
                n = n + version2.charAt(i);
            }
        }
        v2.add(Integer.parseInt(n));
        int i = 0, j = 0;
        
        // for(int k : v1)
        // {
        //     System.out.print(" "+k);
        // }
        // System.out.println();
        //         for(int k : v2)
        // {
        //     System.out.print(" "+k);
        // }
        //         System.out.println();
        
        while(i < v1.size() && j < v2.size())
        {
                    // System.out.println("v1 "+ v1.get(i) + " v2 "+ v2.get(j));

            if(v1.get(i) < v2.get(j))
                return -1;
            else if(v1.get(i) > v2.get(j))
            {
                return 1;
            }

            ++i;
            ++j;

        }
        
        while(i < v1.size())
        {
            if(v1.get(i) > 0)
                return 1;
            ++i;
        }
        
        while(j < v2.size())
        {
            if(v2.get(j) > 0)
                return -1;
            ++j;
        }
        
        return 0;
        
    }
}