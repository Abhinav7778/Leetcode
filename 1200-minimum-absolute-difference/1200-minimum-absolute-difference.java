class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < arr.length ; ++i)
        {
            min = Math.min(arr[i] - arr[i-1], min);
        }
        // System.out.println("min "+ min);
        for(int i = 1; i < arr.length; ++i)
        {
            // System.out.println(" "+arr[i-1]+" "+arr[i]);
            if(arr[i] - arr[i-1] == min)
                res.add(Arrays.asList(arr[i-1], arr[i]));
        }
        return res;
    }
}