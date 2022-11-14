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
    
    List<Integer> res;
    public int kthSmallest(TreeNode root, int k) {
        
        res = new ArrayList<>();
        
        
        helper(root);
        
        if(res.size() == 1)
            return root.val;
        
        for(int i = 0; i < res.size(); ++i)
        {
            System.out.print(" "+ res.get(i));
            if(i == k - 1)
                return res.get(i);
        }
        
        return 0;
    }
    
    public void helper(TreeNode root)
    {
        if(root == null)
            return;
        
        helper(root.left);
        res.add(root.val);
        helper(root.right);
    }
}