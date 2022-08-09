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
    public int maxPathSum(TreeNode root) {
        
        helper(root);
        
        return res;
    }
    
    private int helper(TreeNode root)
    {
        //BC
        if(root == null)return 0;
        
        //HYPOTHESIS
        
        int leftH = helper(root.left);
        int rightH = helper(root.right);
        
        //INDUCTION
        
        //case when cuur root is part of answer's left or right subtree, here the outer max is for the case when booth the left and right subtree are negative, in that case it will be better to not consider them in the answer calculation, since in here we can start from non-leaf nodes, we can ignore these nodes.
        
        int temp = Math.max(root.val, root.val + Math.max(leftH, rightH));
        
        //case when curr root is the answer
        int ans = Math.max(root.val + leftH + rightH, temp);
        
        res = Math.max(res, ans);
        

        
        return temp;
    }
}