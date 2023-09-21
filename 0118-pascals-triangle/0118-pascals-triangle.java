class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        List<Integer> firstRow = new ArrayList<>(Arrays.asList(1));
        res.add(firstRow);        

        for(int i = 1; i <numRows; ++i)//012
        {
            List<Integer> middleRows = new ArrayList<>();
            for(int j = 0; j <= i; ++j)
            {
                if(j == 0 || j == i)
                {
                    middleRows.add(1);
                }
                else
                {
                    middleRows.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));                    
                }
            }
            res.add(middleRows);
        }
        
        return res;
    }
}