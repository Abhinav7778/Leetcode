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
    public boolean findTarget(TreeNode root, int k) {
        res = new ArrayList<>();
        
        helper(root);
        
        Set<Integer> hs = new HashSet<>();
        
        for(int i = 0; i < res.size(); ++i)
        {
            if(hs.contains(res.get(i)))
                return true;
            hs.add(k - res.get(i));
        }
        return false;
    }
    public void helper(TreeNode root)
    {
        if(root == null)
            return ;
        
        helper(root.left);
        res.add(root.val);
        helper(root.right);
    }
}