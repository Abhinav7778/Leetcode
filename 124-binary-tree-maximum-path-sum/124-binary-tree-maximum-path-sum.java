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
    int max;
    public int maxPathSum(TreeNode root) {
        max = Integer.MIN_VALUE;
        helper(root);
        return max;
    }
    private int helper(TreeNode root)
    {
        if(root == null)return 0;
        
        int left_val = helper(root.left);
        int right_val = helper(root.right);
        
        int temp = Math.max(root.val, root.val + Math.max(left_val, right_val));
        
        max = Math.max(max, root.val + left_val + right_val);
        max = Math.max(max, temp);
        
        
        return temp;
    }
}