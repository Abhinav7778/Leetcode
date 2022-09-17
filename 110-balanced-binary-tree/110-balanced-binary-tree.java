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
    
    public int helper(TreeNode root)
    {
        if(root == null)
            return 0;
        
        int left_ht = helper(root.left);
        int right_ht = helper(root.right);
        
        if(Math.abs(left_ht - right_ht) > 1)
        {
            isBal = false;
        }
        return 1 + Math.max(left_ht, right_ht);
    }
}