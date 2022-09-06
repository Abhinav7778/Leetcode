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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        return helper(inorder, 0, inorder.length - 1, postorder, postorder.length - 1);
        
    }
    
    private TreeNode helper(int[] inorder, int ins, int ine, int[] postorder, int ps)
    {
        if(ps < 0 || ins > ine)return null;
        
        TreeNode root = new TreeNode(postorder[ps]);
        
        int index = 0;
        
        for(int i = 0; i < inorder.length; ++i)
        {
            if(inorder[i] == postorder[ps])
            {
                index = i;
                break;
            }
        }
        
        root.left = helper(inorder, ins, index - 1, postorder, ps - (ine - index + 1));
        
        root.right = helper(inorder, index + 1, ine, postorder, ps - 1);
        
        return root;
    }
}