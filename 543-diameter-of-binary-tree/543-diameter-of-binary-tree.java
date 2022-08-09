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
    int res = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        
        helper(root);
        
        return res - 1;
    }
    
    private int helper(TreeNode root)
    {
        //BC
        if(root == null)return 0;
        
        //HYPOTHESIS
        
        int left_height = helper(root.left);
        int right_height = helper(root.right);
        
        
        //INDUCTION
        // case when the curr root is the ans, i.e. longest path goes through it amd left and right subtrees
        int ans = 1 + left_height + right_height;
        //comparing to see if theis is the longest path
        res = Math.max(res, ans);
        
        
        
        //case when curr root is not the ans, but part of it
        
        int temp = 1 + Math.max(left_height, right_height);
        
        return temp;
    }
}