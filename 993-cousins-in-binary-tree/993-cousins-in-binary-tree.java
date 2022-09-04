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
    TreeNode par1 = null;
    TreeNode par2 = null;
    int[] height = new int[2];
    public boolean isCousins(TreeNode root, int x, int y) {
        
        helper(null, root, x, y, 0);
        // helper(null, root.left, x, y, 0);       
        
        if(height[0] == height[1] && par1 != par2)return true;
        
        return false;
    }
    
    private void helper(TreeNode par, TreeNode root, int x, int y, int level)
    {
        if(root == null)
        {
            return ;
        }
        
        if(root.val == x)
        {
            par1 = par;
            height[0] = level;
        }
        else if(root.val == y)
        {
            par2 = (par);
            height[1] = level;
        }

        helper(root, root.left, x, y, level +1);
        helper(root, root.right, x, y, level + 1);
        
    }
}