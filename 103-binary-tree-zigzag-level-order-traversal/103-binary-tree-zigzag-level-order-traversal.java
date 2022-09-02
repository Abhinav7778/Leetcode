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
  
    /* ***************RECURSIVE****************************
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
    
    */
    
    /***********************ITERATIVE**********************/
    
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        if(root == null)return res;
        
        q.add(root);
        boolean isUlta = false;
        
        while(!q.isEmpty())
        {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            isUlta = !isUlta;
            
            
            
            for(int i = 0; i < size; ++i)
            {
                TreeNode curr = q.remove();
                
                if(curr == null)break;
                
                level.add(curr.val);
                
                if(curr.left != null)
                {
                    q.add(curr.left);
                }
                if(curr.right != null)
                {
                    q.add(curr.right);
                }
            }
            
            if(!isUlta)
            {
                Collections.reverse(level);
            }
            res.add(level);
        }
        
        return res;
    }
    
}