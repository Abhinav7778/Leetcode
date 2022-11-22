class Solution {
    
  //  TC: O(N log N)
//     public int longestConsecutive(int[] nums) {
//         Arrays.sort(nums);

//         if(nums.length == 0)return 0;
//         int count = 1, max = Integer.MIN_VALUE;
//         for(int i = 1; i < nums.length; ++i)
//         {
//             if(nums[i] == nums[i-1])
//             {
//                 continue;
//             }
//             if(nums[i] == nums[i-1] + 1)
//             {
//                 ++count;
//                 max = Math.max(max, count);
//             }
//             else
//             {
//                 count = 1;
//             }
//         }
//         return max == Integer.MIN_VALUE ? 1 : max;
//     }
// }

  public int longestConsecutive(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for(int n : nums) {
                set.add(n);
            }
            int best = 0;
            for(int n : set) {
                if(!set.contains(n - 1)) {  // only check for one direction
                    int m = n + 1;
                    while(set.contains(m)) {
                        m++;
                    }
                    best = Math.max(best, m - n);
                }
            }
            return best;
        }
}