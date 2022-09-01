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
    int max = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return max - 1;
    }
    
    public int helper(TreeNode root)
    {
        
        if(root == null)return 0;
        
        int left_val = helper(root.left);
        int right_val = helper(root.right);
        
        //when actual answer
        int ans = 1 + left_val + right_val;
        
        //check for max
        max = Math.max(max, ans);
        
        
        //Not the ans, but could be a part of it
        
        return 1 + Math.max(left_val, right_val);
    }
}