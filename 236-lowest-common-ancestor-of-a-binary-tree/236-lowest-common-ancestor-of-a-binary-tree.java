/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        TreeNode res = new TreeNode(root.val);
        
        List<TreeNode> pathP = new ArrayList<>();
        
        List<TreeNode> pathQ = new ArrayList<>();
        
        helper(root, p, pathP);
        
        helper(root, q, pathQ);

        for(int i = 0; i < pathP.size(); ++i)
        {
            if(pathQ.size() <= i || pathP.size() <= 1)break;
            if(pathP.get(i) == pathQ.get(i))
            {
                res = pathP.get(i);
            }
            else
            {
                break;
            }
        }
        
        return res;
    }
    private boolean helper(TreeNode root, TreeNode x, List<TreeNode> path)
    {
        if(root == null)return false;
        
        path.add(root);
        
        if(root.val == x.val)return true;
        
        if(helper(root.left, x, path) || helper(root.right, x, path))
        {
            return true;
        }
        
        path.remove(path.size() - 1);
        
        return false;
    }
}