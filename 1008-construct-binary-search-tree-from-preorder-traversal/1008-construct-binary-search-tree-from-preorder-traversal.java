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
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(0, preorder.length - 1, preorder);
    }
    public TreeNode helper(int s, int e, int[] p)
    {
        if(s > e)
            return null;
        
        TreeNode root = new TreeNode(p[s]);
        
        int i;
        for(i = s ;i <= e; ++i)
        {
            if(p[i] > p[s])
                break;
        }
        
        root.left = helper(s + 1, i - 1, p);
        root.right = helper(i, e, p);
        
        return root;
    }
}