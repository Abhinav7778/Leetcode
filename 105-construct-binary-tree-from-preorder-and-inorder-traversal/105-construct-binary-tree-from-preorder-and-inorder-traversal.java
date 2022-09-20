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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0, preorder, 0, inorder.length - 1, inorder);
    }
    public TreeNode helper(int preSt, int[] preorder, int inSt, int inE, int[] inorder)
    {
        if(preSt > preorder.length || inSt > inE)return null;
        TreeNode res = new TreeNode(preorder[preSt]);
        int index = 0;
        for(int i = 0; i < inorder.length; ++i)
        {
            if(inorder[i] == preorder[preSt])
            {
                index = i;
                break;
            }
        }
        
        res.left = helper(preSt + 1, preorder, inSt, index - 1, inorder);
        res.right = helper(preSt + (index - inSt) + 1, preorder, index + 1, inE, inorder);
        
        return res;
        
        
    }
}