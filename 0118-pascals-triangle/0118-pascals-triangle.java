class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        
        
        
        for(int i = 0; i < numRows; ++i)
        {
            List<Integer> currentRow = new ArrayList<>();
            if(i == 0)
            {
                List<Integer> fr = new ArrayList<>(Arrays.asList(1));
                res.add(fr);
                continue;
            }
            currentRow.add(1);
            
            List<Integer> prevRow = res.get(i-1);
            
            for(int j = 1; j < prevRow.size(); ++j)
            {
                currentRow.add(prevRow.get(j-1) + prevRow.get(j));
            }
            currentRow.add(1);
            
            res.add(currentRow);
        }
        return res;
    
    }
}