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
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        helper(root, true, 0);
        
        for(int i = 0; i < res.size(); ++i)
        {
            if(i % 2 != 0)
            {
                Collections.reverse(res.get(i));

            }
        }
        
        return res;
    }
    
    private void helper(TreeNode root, boolean isSeedha, int level)
    {
        if(root == null)return;
        if(level == res.size())
        {
            res.add(new ArrayList<>());
            isSeedha = !isSeedha;
        }
        res.get(level).add(root.val);
        

        if(root.left != null)
        {
            helper(root.left, isSeedha, level + 1);
        }
        if(root.right != null)
        {
            helper(root.right, isSeedha, level + 1);
        }

    }
}