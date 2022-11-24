class Solution {
    public int waysToSplit(int[] nums) {
        int n = nums.length;
        int res = 0, mod = (int)Math.pow(10, 9) + 7;
        int[] prefixSum = new int[n];
        prefixSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
        // i is the end of left subarray
        // j is the min end of mid subarray
        // k is the max end of mid subarray
        for (int i = 0, j = 0, k = 0; i < n - 2; i++) {
            // j must be greater than i, right subarray should have at least 1 element, so j < n - 1
            while (j <= i || (j < n - 1 && prefixSum[j] - prefixSum[i] < prefixSum[i])) {
                j++;
            }
            // k could be equal to j, right subarray should have at least 1 element, so k < n - 1
            while (k < j || (k < n - 1 && prefixSum[k] - prefixSum[i] <= prefixSum[n - 1] - prefixSum[k])) {
                k++;
            }
            // after the above while loop, 
            // the ccondition (k < n - 1 && prefixSum[k] - prefixSum[i] <= prefixSum[n - 1] - prefixSum[k]) is not met
            // so we should decrement k by 1
            k--;
            res = (res + k - j + 1) % mod;
        }
        return res;
    }
}