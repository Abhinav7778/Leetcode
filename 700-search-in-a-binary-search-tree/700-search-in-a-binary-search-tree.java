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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null)return root;
        
        if(root.val == val)return root;
        
        TreeNode right =  searchBST(root.right, val);
        
        TreeNode left = searchBST(root.left, val); 
        
        if(right != null)return right;
        
        return left;
    }
}