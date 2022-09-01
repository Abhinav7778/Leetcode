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
    boolean isBal = true;
    public boolean isBalanced(TreeNode root) {
        
        helper(root);
        
        return isBal;
    }
    
    private int helper(TreeNode root)
    {
        if(root == null)return 0;
        
        int lh = helper(root.left);
        int rh = helper(root.right);
        
        if(Math.abs(lh - rh) > 1)
        {
            isBal = false;
        }
        
        return 1+ Math.max(lh, rh);
    }
}