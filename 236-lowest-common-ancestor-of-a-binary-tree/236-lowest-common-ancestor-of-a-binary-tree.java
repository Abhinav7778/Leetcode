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
        ArrayList<TreeNode> tillP = new ArrayList<>();
        
        ArrayList<TreeNode> tillQ = new ArrayList<>();
        
        helper(root, p, tillP);
        
        helper(root, q, tillQ);
        
        for(int i = 0; i < tillP.size(); ++i)
        {
            System.out.print(" "+tillP.get(i).val);
        }
        System.out.println();
        
                
        for(int i = 0; i < tillQ.size(); ++i)
        {
            System.out.print(" "+tillQ.get(i).val);
        }
        
        
        int j = 0, i = 0;
        
        for( i = 0; i < tillP.size(); ++i)
        {
            if( j >= tillQ.size())
                break;
            if(tillP.get(i).val != tillQ.get(j).val)
            {
                return tillP.get(i - 1);
            }
            ++j;
        }
        return tillP.get(i - 1);
    }
    
    public boolean helper(TreeNode root, TreeNode x, ArrayList<TreeNode> tillX)
    {
        if(root == null)
            return false;
        
        tillX.add(root);
        
        if(root == x)
            return true;
        
        
        
        if(helper(root.left, x, tillX) || helper(root.right, x, tillX))
        {
            return true;
        }
        
        tillX.remove(tillX.size() - 1);
        
        
        return false;
    }
}