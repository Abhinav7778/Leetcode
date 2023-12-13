class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> hsr = new HashSet<>();
        Set<Integer> hsc = new HashSet<>();

        for(int i = 0; i < matrix.length; ++i)
        {
            for(int j = 0; j < matrix[0].length; ++j)
            {
                if(matrix[i][j] == 0)
                {
                    hsr.add(i);
                    hsc.add(j);
                }
            }
        }

        for(int i = 0; i < matrix.length; ++i)
        {
            for(int j = 0; j < matrix[0].length; ++j)
            {
                if(hsr.contains(i) || hsc.contains(j))
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}