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
        TreeNode binaryTree;
        binaryTree = helper( preorder, 0, inorder, 0, inorder.length - 1);
        return binaryTree;
    }
    private TreeNode helper(int[] preorder, int preSt, int[] inorder, int inSt, int inE)
    {
        
        if(preSt >= preorder.length || inSt > inE)return null;
        
        
        TreeNode root = new TreeNode(preorder[preSt]);
        
        int index = 0;
        
        for(int i = 0; i < inorder.length; ++i)
        {
            if(inorder[i] == preorder[preSt])
            {
                index = i;
                break;
            }
        }
        
        root.left = helper(preorder, preSt + 1, inorder, inSt, index - 1);
        root.right = helper(preorder, preSt + (index - inSt + 1), inorder, index + 1, inE);
        
        return root;
        
    }
}