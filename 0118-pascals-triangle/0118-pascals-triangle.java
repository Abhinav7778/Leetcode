class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        List<Integer> first = new ArrayList<>();
        first.add(1);
        res.add(first);


        for(int i = 1; i < numRows; ++i)
        {
            List<Integer> temp = new ArrayList<>();

            List<Integer> prev = new ArrayList<>();
            prev = res.get(i-1);
            temp.add(1);
            for(int j = 1; j <= i - 1; ++j)
            {
                temp.add(prev.get(j-1) + prev.get(j));
            }
            temp.add(1);

            res.add(temp);
        }
        return res;
    }
}