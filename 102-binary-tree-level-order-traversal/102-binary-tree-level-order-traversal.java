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
    
    
    /*********************RECURSIVE(DFS)*******************/
/*    List<List<Integer>> res = new ArrayList<>();
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        if(root == null)return res;
        
        helper(root, 0);
        
        return res;
    }
    
    private void helper(TreeNode root, int level)
    {
        if(level == res.size())//why this works? bcoz level we inc the level in each left/right subtree call, and the res' size is increased in each level + we make entries and the level is inc for the next right/left subtree HENCE when increased it is equal to res' size therefore we add another level and SO ON...
        {
            res.add(new ArrayList<>());
        }
        
        res.get(level).add(root.val);
        
        if(root.left != null)
        {
            helper(root.left, level + 1);
        }
        
        if(root.right != null)
        {
            helper(root.right, level + 1);
        }
    }
    //RECURSIVE ENDS
    */
    
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> res = new ArrayList<>();
        
        Queue<TreeNode> q = new LinkedList<>();
        
        if(root == null)return res;
        
        q.add(root);
        
        while(!q.isEmpty())
        {
            int size = q.size();
            
            List<Integer> currLevel = new ArrayList<>();
            for(int i = 0; i < size; ++i)//each for loop for 1 level i.e. 9, 20 in one for loop and then their added children in next while iteration's for loop
            {
                TreeNode node = q.remove();
                currLevel.add(node.val);
                
                if(node.left != null)
                {
                    q.add(node.left);
                }
                if(node.right != null)
                {
                    q.add(node.right);
                }
            }
            res.add(currLevel);
        }
        
        return res;
        
    }
    
    
}