/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        
        return helper(0, nums.length - 1, nums);
    }
    public TreeNode helper(int s, int e, int[] nums)
    {
        if(s > e) 
            return null;
        
        TreeNode root = new TreeNode(nums[(s + e)/2]);
        
        root.left = helper(s, (s+e)/2 - 1, nums);
        
        root.right = helper((s + e)/2 + 1, e, nums);
        
        return root;
    }
}