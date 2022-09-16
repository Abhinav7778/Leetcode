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
        if(root == null)
            return 0;
        
        
        int leftht = helper(root.right);
        int rightht = helper(root.left);
        
        max = Math.max(max, 1 + leftht + rightht);
        
        return 1 + Math.max(leftht, rightht);
    }
}